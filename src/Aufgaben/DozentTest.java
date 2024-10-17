package Aufgaben;

public class DozentTest {

    public static void main(String[] args) {
        Dozent dieDozentin;
        Dozent derDekan;

        dieDozentin= new Dozent("Dr.Zeuma","DBA", 'W');
        derDekan=new Dozent("Dr.Conan","LDS",'M');

        System.out.println(derDekan.getName()+", "
                +derDekan.isDekan()+", "
                +derDekan.getLehrgebiet()+", "
                +derDekan.getGeschlecht());

        dieDozentin.setLehrgebiet("MCI");
        System.out.println(dieDozentin.getLehrgebiet()+", "+
                dieDozentin.getName()+", "+
                dieDozentin.isDekan()+", "+
                dieDozentin.getGeschlecht());

    }
}