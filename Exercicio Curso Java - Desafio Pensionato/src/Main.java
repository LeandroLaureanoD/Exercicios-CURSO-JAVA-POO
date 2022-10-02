import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented ? ");
        int qtdQuartos = sc.nextInt();
        int roomBusy;
        int equalRooms = 0;
        String name;
        String email;
        Room[] roomVetor = new Room[9];

        for (int i = 0; i < qtdQuartos; i++){
            System.out.println("Rent #" + (i +1));
            sc.nextLine();
            System.out.print("Name: ");
            name = sc.nextLine();

            System.out.print("Email: ");
            email = sc.nextLine();

            System.out.print("Room: ");
            roomBusy = sc.nextInt();

            //IF para verificar se o quarto está ocupado ou não
            if(roomBusy != equalRooms ){
                equalRooms = roomBusy;
            }else {
                //While verifica novamente até ele digitar um quarto desocupado
                while (roomBusy == equalRooms){
                    System.out.println();
                    System.out.println("WARNING: 'Room " + roomBusy + " it's already busy', choose another room" );
                    System.out.println("Rent #" + (i + 1));
                    sc.nextLine();
                    System.out.print("Name: ");
                    name = sc.nextLine();

                    System.out.print("Email: ");
                    email = sc.nextLine();

                    System.out.print("Room: ");
                    roomBusy = sc.nextInt();
                }
            }
            roomVetor[roomBusy] = new Room(name, email, roomBusy);

            System.out.println();
        }
        System.out.println("Busy Rooms: ");
        for (Room room : roomVetor) {
            if (room != null) {
                System.out.println(room);
            }
        }
    }
}
