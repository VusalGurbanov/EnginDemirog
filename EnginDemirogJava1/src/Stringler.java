public class Stringler {
    public static void main(String[] args) {
        String mesaj ="Bugün hava çok güzel";
        System.out.println(mesaj);

		/*System.out.println("Eleman sayısı = " + mesaj.length());
		System.out.println("5.eelman : "+ mesaj.charAt(4));
		System.out.println(mesaj.concat(" yaşasın ! "));
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("l"));
		char [] karekterler = new char[25];
		mesaj.getChars(0, 5, karekterler, 0);
		System.out.println(karekterler);
		System.out.println(mesaj.indexOf("va"));
		System.out.println(mesaj.lastIndexOf('e'));*/

		/*String yeniMesaj = mesaj.replace(' ','-');
		System.out.println(yeniMesaj);

		System.out.println(mesaj.substring(5));
		System.out.println(mesaj.substring(2, 10));*/

        for (String kelime : mesaj.split("")) {
            System.out.println(kelime);
        }
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.toLowerCase());

        System.out.println(mesaj.trim());// başındaki ve sonnudaki boşluğu alma
    }
}
