import java.util.*;
class File{
    String Name;
    int Size;
    String Date;
    int amount;

    File(String Name, int Size, String Date,int amount){
        this.Name = Name;
        this.Size = Size;
        this.Date = Date;
        this.amount = amount;
    }
}
public class Main {
    public static void main(String[] args){
        File[] files = {
                new File("Дота",2000,"22.10.2024", 3),
                new File("Кс Го", 3000, "20.11.2006", 5),
                new File("Валорант", 4000,"20.12.2008", 10)
        };
        System.out.println("Файлы, у которых размер выше определенного");
        for (int i = 0; i < files.length; i++) {
            if (files[i].Size > 3500 ) {
                System.out.println(files[i].Name);
            }
        }
        System.out.println("Файлы, у которых число обращений выше определенного");
        for (int i = 0; i < files.length; i++){
            if ( files[i].amount > 4 ){
                System.out.println(files[i].Name);
            }
        }
    }
}