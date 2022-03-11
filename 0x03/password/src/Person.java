public class Person {
    public Person(){

    }
    public boolean checkUser(String loginUsuario){
        return !loginUsuario.contains("[,.@$^?~=+\\-_\\/*\\-+.\\|])).{8,]");
    }



    public boolean checkPassword(String senhaUsuario){
        //return   senhaUsuario.contains("/^(?=.*[A-Z](?=.*[0-9])(?=.*[}{,.@$^?~=+\\-_\\/*\\-+.\\|])){8,}$/)");
        return senhaUsuario.length() >= 8 && senhaUsuario.matches("^(?=.*[A-Z])(?=.*\\d)(?=.*[-+_!@#$%^&*., ?]).+$");
    }
}
