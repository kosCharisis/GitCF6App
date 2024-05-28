package gr.aueb.cf.ch12.model;

/**
 * {@link UserUser} Java Bean.
 * @author Costas
 * @version
 */
public class UserUser {

        private long id;
        private String firstname;
        private String lastname;

        public UserUser() {

        }

    public UserUser(long id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
