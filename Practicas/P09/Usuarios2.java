public class Usuarios2 {
	private String nickname = "";
	private String pasword = "";

	public void setNickname(String p_nickname) {
        this.nickname = p_nickname;
    }
     public String getNickname() {
        return nickname;
    }
    public void setPasword(String p_pasword) {
        this.pasword = p_pasword;
    }
     public String getPasword() {
        return pasword;
    }
    public String toString() {
    	return "Nickname: " + this.nickname;
    }
}
