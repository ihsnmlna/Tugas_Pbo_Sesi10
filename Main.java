public class Main {
    public static void main(String[] args) {
        String str1 = "Ihsan";
        String str2 = new String("Maulana");
        
        // Mendapatkan panjang string
        int length = str1.length();
        
        // Menggabungkan string
        String combined = str1.concat(str2);
        
        // Mengambil karakter pada posisi tertentu
        char character = str1.charAt(0);
        
        // Membandingkan string
        boolean isEqual = str1.equals(str2);
        
        // Mencari posisi substring dalam string
        int index = str1.indexOf("lo");
        
        // Mengubah string menjadi huruf kapital atau kecil
        String upperCase = str1.toUpperCase();
        String lowerCase = str2.toLowerCase();
        
        // Memotong string
        String substring = str1.substring(2, 4);
        
        // Menghapus spasi di awal dan akhir string
        String trimmed = str1.trim();
        
        // Mengganti karakter dalam string
        String replaced = str1.replace('l', 'z');
        
        // Menampilkan hasil
        System.out.println("Panjang string: " + length);
        System.out.println("Gabungan string: " + combined);
        System.out.println("Karakter pertama: " + character);
        System.out.println("Apakah string sama: " + isEqual);
        System.out.println("Posisi substring: " + index);
        System.out.println("Huruf kapital: " + upperCase);
        System.out.println("Huruf kecil: " + lowerCase);
        System.out.println("Potongan string: " + substring);
        System.out.println("String setelah di-trim: " + trimmed);
        System.out.println("String setelah diganti: " + replaced);
    }
}
