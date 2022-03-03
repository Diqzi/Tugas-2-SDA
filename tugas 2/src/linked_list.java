import java.util.LinkedList;

public class linked_list{
    public static void main(String[] args) {
        LinkedList<String> saya = new LinkedList<String>();

        saya.add("D");
        saya.add("I");
        saya.add("Q");
        saya.add("Z");
        saya.add("I");
        saya.add("");
        saya.add("A");
        saya.add("P");
        saya.add("R");
        saya.add("I");
        saya.add("A");
        saya.add("L");
        saya.add("D");
        saya.add("I");
        System.out.printf("Nama= " + saya);
        System.out.println("ukuran= " +saya.size());

        saya.add(0,"M");
        saya.add(6,"I");
        saya.add(16,"X");
        System.out.println("Setelah ditambahkan karakter= " + saya);

        saya.set(2,"X");
        saya.set(8,"Y");
        saya.set(5,"Z");
        System.out.println("Setelah disisipkan= " +saya);
       

        saya.remove(2);
        saya.remove(7);
        saya.remove(4);
        System.out.println("setelah di remove= " + saya);

        saya.pop();
        System.out.println(saya);

        saya.push("C");
        saya.push("B");
        saya.push("A");
        System.out.println("setelah ditambahkan= " + saya);

      
    
       
    }
}