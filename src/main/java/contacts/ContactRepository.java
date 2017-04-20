package contacts;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class ContactRepository {
	
	private JdbcTemplate jdbc;
	@Autowired
	public ContactRepository(JdbcTemplate jdbc){
		this.jdbc = jdbc;
	}
	//查询联系人
	public List<Contact> findAll() {
		return jdbc.query(
				"select id,firstname,lastname,phoneNumber,emailNumber"+
				" from contacts order by lastname",
				new RowMapper<Contact>(){
					public Contact mapRow(ResultSet rs, int rowNum) throws SQLException {
						Contact contact = new Contact();
						contact.setId(rs.getLong(1));
						contact.setFirstName(rs.getString(2));
						contact.setLastName(rs.getString(3));
						contact.setPhoneNumber(rs.getString(4));
						contact.setEmailNumber(rs.getString(5));
						return contact;
					}					
				}
			);
	}

	//保存
	public void save(Contact contact) {
		jdbc.update(
				"insert into contacts (firstName,lastName,phoneNumber,emailNumber)"+
			    "values (?,?,?,?)", 
			    contact.getFirstName(),contact.getLastName(),
			    contact.getPhoneNumber(),contact.getEmailNumber());
	}

}
