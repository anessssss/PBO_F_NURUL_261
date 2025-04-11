class Admin {
    private String username = "Admin261";
    private String password = "password261";

    // Method untuk login admin
    public boolean login(String inputUser, String inputPass) {
        return inputUser.equals(username) && inputPass.equals(password);
    }
}