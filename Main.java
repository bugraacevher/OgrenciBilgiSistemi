package Giris;

public class Main {
    public static void main(String[] args) {
       Teacher t1 = new Teacher("mahmut hoca","trh","555");
       Teacher t2 = new Teacher("Graham Bell","FZK","2323");
       Teacher t3 = new Teacher("Kulyutmaz","BIO","111");

       Course tarih = new Course("Tarih","101","TRH");
       tarih.addTeacher(t1);

       Course fizik = new Course("fizik","102","FZK");
       fizik.addTeacher(t2);

       Course biyo = new Course("Biyoloji","101","BIO");
       biyo.addTeacher(t3);

       Student s1 = new Student("Inek Saban", "123","4",tarih,fizik,biyo);
       s1.addBulkExamNote(100,78,50);
       s1.isPass();

       Student s2 = new Student("necmi","124","3",tarih,fizik,biyo);
       s2.addBulkExamNote(98,11,56);
       s1.isPass();
    }
}
