public class Room {

    private String nome;
    private String email;
    private int room;
    public Room(String nome, String email, int room) {
        this.nome = nome;
        this.email = email;
        this.room = room;
    }
    
    @Override
    public String toString() {
        return room + ":" + " " + nome + ", " + email;
    }
}
