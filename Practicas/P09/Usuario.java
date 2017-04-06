public class Usuario {
	private String nombre = "";
	private	String telefono = "";
	private String direccion = "";
	private String mail = "";
	private String nickname = "";
	private String fecha_nacimiento = "";
	
	public Usuario () {}
	
	public Usuario(String p_nombre, String p_telefono, String p_direccion) {
		setNombre(p_nombre);
		setTelefono(p_telefono);
		setDireccion(p_direccion);
	}
	public Usuario(String nombre, String telefono, String direccion, String mail) {
        setNombre(nombre);
		setTelefono(telefono);
		setDireccion(direccion);
        setMail(mail);
    }
	public Usuario(String nombre, String telefono, String direccion, String mail, String nickname, String fecha_nacimiento) {
        setNombre(nombre);
		setTelefono(telefono);
		setDireccion(direccion);
        setMail(mail);
        setNickname(nickname);
        setFecha_nacimiento(fecha_nacimiento);
    }

	public void setNombre(String p_nombre) {

        this.nombre = p_nombre;
    }
    public void setTelefono(String p_telefono) {
        this.telefono = p_telefono;
    }
    public void setDireccion(String p_direccion) {
        this.direccion = p_direccion;
    }
    public void setMail(String p_mail) {
        this.mail = p_mail;
    }
    public void setNickname(String p_nickname) {
        this.nickname = p_nickname;
    }
    public void setFecha_nacimiento(String p_fecha_nacimiento) {
        this.fecha_nacimiento = p_fecha_nacimiento;
    }

    public String getNombre() {
        return nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getDireccion() {
        return direccion;
    }
    public String getMail() {
        return mail;
    }
    public String getNickname() {
        return nickname;
    }
    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }
   public String toString() {
		return ("Nombre: " +  this.nombre + "\nTelefono: " + this.telefono) + 
		("\nDireccion: " + this.direccion + "\nMail: " + this.mail) + 
		("\nNickname: " + this.nickname + "\nFecha Nacimento: " + this.fecha_nacimiento);
	}
}