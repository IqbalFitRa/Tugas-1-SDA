import java.util.ArrayList;

class Array
{
    public static void main(String[] args) 
    {
        ArrayList<String> nama = new ArrayList<String>();
        System.out.println("        ---TUGAS 1---         ");
        System.out.println("        --- ARRAY ---         ");
        System.out.println("------------------------------");
        System.out.println(" ");


        System.out.println(" ");
        System.out.println("Dilakukan pengecekan terhadap array 'nama', Status Array adalah : " +nama.isEmpty());

        nama.add("r");
        nama.add("a");
        nama.add("m");
        nama.add("a");

        System.out.println(" ");
        System.out.println("Array bernama 'nama' memiliki element array : " +nama);
        System.out.println("------------------------------");

        System.out.println(" ");
        System.out.println("Dilakukan pengecekan terhadap array 'nama', Status Array adalah : " +nama.isEmpty());
        System.out.println("------------------------------");

        System.out.println(" ");
        System.out.println("Ukuran Array saat ini adalah " +nama.size());
        System.out.println("------------------------------");

        System.out.println(" ");
        System.out.println("Dilakukan penambahan element pada indeks 0, 2, 3, 4, 6, -3");
        nama.add(0,"e");
        nama.add(2,"f");
        nama.add(3,"g");
        nama.add(4,"h");
        nama.add(6,"h");
        //nama.add(-3,"j");
        System.out.println(" ");
        System.out.println("Array bernama 'nama' memiliki element array : " +nama);
        System.out.println("------------------------------");


        System.out.println(" ");
        System.out.println("Dilakukan pengambilan elemen pada indeks ke-0 dari Array 'nama' : " +nama.get(0));
        System.out.println("Dilakukan pengambilan elemen pada indeks ke-2 dari Array 'nama' : " +nama.get(2));
        System.out.println("Dilakukan pengambilan elemen pada indeks ke-6 dari Array 'nama' : " +nama.get(6));
        //System.out.println("Dilakukan pengambilan elemen pada indeks ke-(-3) dari Array 'nama' : " +nama.get(-3));
        System.out.println("------------------------------");


        System.out.println(" ");
        System.out.println("Indeks untuk 'a' : " +nama.indexOf("a"));
        System.out.println("Indeks untuk 'c' : " +nama.indexOf("c"));
        System.out.println("Indeks untuk 'q' : " +nama.indexOf("q"));
        System.out.println("------------------------------");


        System.out.println(" ");
        System.out.println("Dilakukan pengurangan (hapus) element pada indeks 0, 3, 2");;
        nama.remove(0);
        nama.remove(3);
        nama.remove(2);
        System.out.println(" ");

        System.out.println("Array bernama 'nama' memiliki element array : " +nama);
        System.out.println(" ");
        System.out.println("Ukuran Array saat ini adalah " +nama.size());
        System.out.println("------------------------------");
        System.out.println(" ");

    }
}