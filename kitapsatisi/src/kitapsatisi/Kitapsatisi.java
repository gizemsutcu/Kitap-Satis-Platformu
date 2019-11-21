//Gizem SÜTÇÜ
//1306160069
package kitapsatisi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Kitapsatisi {

    public interface TutarBilgisi {

        public double tutarHesabı();
    }

    public interface SiparisOlusumu {

        public void siparisOlustur();
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {

        /*File uyelik = new File("uyelik.txt");
                try {
                if (!uyelik.exists()) {
                uyelik.createNewFile();
                System.out.println(uyelik.getName() + " adlı dosya Olusturuldu..");
                } 
                else {
                System.out.println("Dosya oldugundan olusturma islemi yapılmayacaktır. ");
                }
        }catch (IOException e) {
            e.printStackTrace();
        }
         
File uyeKullaniciAdi = new File("uyeKullaniciAdi.txt");
                try {
                if (!uyeKullaniciAdi.exists()) {
                uyeKullaniciAdi.createNewFile();
                System.out.println(uyeKullaniciAdi.getName() + " adlı dosya Olusturuldu..");
                } else {
                System.out.println("Dosya oldugundan olusturma islemi yapılmayacaktır. ");
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
File uyeParola = new File("uyeParola.txt");
                try {
                if (!uyeParola.exists()) {
                uyeParola.createNewFile();
                System.out.println(uyeParola.getName() + " adlı dosya Olusturuldu..");
                } else {
                System.out.println("Dosya oldugundan olusturma islemi yapılmayacaktır. ");
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
 
File kitaplistesi = new File("kitaplistesi.txt");
                try {
                if (!kitaplistesi.exists()) {
                kitaplistesi.createNewFile();
                System.out.println(kitaplistesi.getName() + " adlı dosya Olusturuldu..");
                } 
                else {
                System.out.println("Dosya oldugundan olusturma islemi yapılmayacaktır. ");
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        
File kitapAdi = new File("kitapAdi.txt");
                try {
                if (!kitapAdi.exists()) {
                kitapAdi.createNewFile();
                System.out.println(kitapAdi.getName() + " adlı dosya Olusturuldu..");
                } else {
                System.out.println("Dosya oldugundan olusturma islemi yapılmayacaktır. ");
                }
        } catch (IOException e) {
            e.printStackTrace();
        }

File kitapYazarListesi = new File("kitapYazarListesi.txt");
                try {
                if (!kitapYazarListesi.exists()) {
                kitapYazarListesi.createNewFile();
                System.out.println(kitapYazarListesi.getName() + " adlı dosya Olusturuldu..");
                } else {
                System.out.println("Dosya oldugundan olusturma islemi yapılmayacaktır. ");
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
File kitapTutari = new File("kitapTutari.txt");
                try {
                if (!kitapTutari.exists()) {
                kitapTutari.createNewFile();
                System.out.println(kitapTutari.getName() + " adlı dosya Olusturuldu..");
                } else {
                System.out.println("Dosya oldugundan olusturma islemi yapılmayacaktır. ");
                }
        } catch (IOException e) {
            e.printStackTrace();
        }          
        
File siparisler = new File("siparisler.txt");
                try {
                if (!siparisler.exists()) {
                siparisler.createNewFile();
                System.out.println(siparisler.getName() + " adlı dosya Olusturuldu..");
                } 
                else {
                System.out.println("Dosya oldugundan olusturma islemi yapılmayacaktır. ");
                }
            }
            catch (IOException e ) {
                e.printStackTrace();
            }

  File odeme = new File("odeme.txt");
                try {
                if (!odeme.exists()) {
                odeme.createNewFile();
                System.out.println(odeme.getName() + " adlı dosya Olusturuldu..");
                } 
                else {
                System.out.println("Dosya oldugundan olusturma islemi yapılmayacaktır. ");
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }*/
        class Kitap {

            private String adı;
            private String yazar;
            private String yayınEvi;
            private double fiyat;

            public Kitap(String adı, String yazar, String yayınEvi, double fiyat) {
                this.adı = adı;
                this.yazar = yazar;
                this.yayınEvi = yayınEvi;
                this.fiyat = fiyat;
            }

            private Kitap() {
                this.adı = null;
                this.yazar = null;
                this.yayınEvi = null;
                this.fiyat = 0;
            }

            public void setAdı(String a) {
                adı = a;
            }

            public String getAdı() {
                return adı;
            }

            public void setYazar(String y) {
                yazar = y;
            }

            public String getYazar() {
                return yazar;
            }

            public void setYayınEvi(String y1) {
                yayınEvi = y1;
            }

            public String getYayınEvil() {
                return yayınEvi;
            }

            public void setFiyat(double f) {
                fiyat = f;
            }

            public Double getFiyat() {
                return fiyat;
            }
        }
        class Uye {

            String adı;
            String soyadı;
            String mail;
            String adres;
            private String kullaniciAdi;
            private String parola;

            public void setAdı(String a) {
                adı = a;
            }

            public String getAdı() {
                return adı;
            }

            public void setSoyadı(String s) {
                soyadı = s;
            }

            public String getSoyadı() {
                return soyadı;
            }

            public void setMail(String m) {
                mail = m;
            }

            public String getMail() {
                return mail;
            }

            public void setAdres(String adr) {
                adres = adr;
            }

            public String getAdres() {
                return adres;
            }

            public void setKullaniciAdi(String k) {
                kullaniciAdi = k;
            }

            public String getKullaniciAdi() {
                return kullaniciAdi;
            }

            public void setParola(String p) {
                parola = p;
            }

            public String getParola() {
                return parola;
            }

            public Uye() {
                adı = null;
                soyadı = null;
                mail = null;
                adres = null;
                kullaniciAdi = null;
                parola = null;
            }

            public Uye(String adı, String soyadı, String adres, String mail, String kullaniciAdi, String parola) {
                this.adı = adı;
                this.soyadı = soyadı;
                this.mail = mail;
                this.adres = adres;
                this.kullaniciAdi = kullaniciAdi;
                this.parola = parola;
            }

        }
        class Sepet extends Kitap implements SiparisOlusumu {

            public Sepet(String adı, String yazar, String yayınEvi, double fiyat) {
                super(adı, yazar, yayınEvi, fiyat);
            }

            public void siparisOlustur() {
            }
        }

        Uye uye = new Uye();
        Uye uyeDizisi[] = new Uye[50];
        for (int i = 0; i < 50; i++) {
            uyeDizisi[i] = new Uye();
        }

        Uye uyeDizisi1[] = new Uye[50];
        for (int x = 0; x < 50; x++) {
            uyeDizisi1[x] = new Uye();
        }

        int secim;
        int kullaniciSayisi = 3;
        int kitapSayisi = 4;
        int sepettekiUrunSayisi = 0;
        String toplamTutar = null;
        String satir1[] = new String[kullaniciSayisi];
        String satir2[] = new String[kullaniciSayisi];

        String kitapAdiDizisi[] = new String[kitapSayisi];
        String kitapYazarDizisi[] = new String[kitapSayisi];
        String kitapFiyatDizisi[] = new String[kitapSayisi];
        ArrayList<String> sepet = new ArrayList<String>();

        Scanner input = new Scanner(System.in);

        /*System.out.println("1->Uyelik İşlemleri");
        System.out.println("2->Kitap Listesini Görüntüle");
        System.out.println("Seciminiz:");
        secim = input.nextInt();

        switch (secim) {
            case 1:*/
        System.out.println("Üyelik İşlemleri");
        System.out.println("1->Üye Ol" + "\n");
        System.out.println("2->Üye Girişi" + "\n");
        System.out.println("Seciminiz");
        secim = input.nextInt();

        switch (secim) {
            case 1:
                System.out.println("Kullanıcı için ad giriniz:");
                uye.adı = input.next();
                System.out.println("Kullanıcı için soyadı giriniz:");
                uye.soyadı = input.next();
                System.out.println("Kullanıcı için adres bilgisi giriniz:");
                uye.adres = input.next();
                System.out.println("Kullanıcı için mail giriniz:");
                uye.mail = input.next();
                System.out.println("Kullanıcı için kullanıcı adı giriniz:");
                uye.kullaniciAdi = input.next();
                System.out.println("kullanıcı için parola giriniz:");
                uye.parola = input.next();
                kullaniciSayisi++;

                try {
                    FileWriter fileWriter = new FileWriter("uyelik.txt", true);
                    BufferedWriter bWriter = new BufferedWriter(fileWriter);
                    bWriter.write(uye.adı + "," + uye.soyadı + "," + uye.adres + "," + uye.mail+"\n");
                    //bWriter.write("\n");
                    bWriter.close();
                    //System.out.println("Ekleme İşlemi Başarılı");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    FileWriter fileWriter1 = new FileWriter("uyeKullaniciAdi.txt", true);
                    BufferedWriter bWriter1 = new BufferedWriter(fileWriter1);
                    bWriter1.write(uye.kullaniciAdi+"\n");
                    //bWriter1.write("\n");
                    bWriter1.close();
                    //System.out.println("Ekleme İşlemi Başarılı");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    FileWriter fileWriter2 = new FileWriter("uyeParola.txt", true);
                    BufferedWriter bWriter2 = new BufferedWriter(fileWriter2);
                    bWriter2.write(uye.parola+"\n");
                    //bWriter2.write("\n");
                    bWriter2.close();
                    //System.out.println("Ekleme İşlemi Başarılı");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                System.out.println("Üye Olma İşlemi Başarılı Bir Şekilde Gerçekleşti");
                System.out.println("Kitap listelerine bakmak ve satın almak için sisteme üye girişi ile tekrardan giriniz");
                break;

            case 2:

                System.out.println("Kullanıcı Adınızı Giriniz:");
                String girilenKullaniciAdi = input.next();

                try {
                    FileInputStream fi = new FileInputStream("uyeKullaniciAdi.txt");
                    BufferedReader buf = new BufferedReader(new InputStreamReader(fi));
                    String satir;
                    while ((satir = buf.readLine()) != null) {
                        for (int a1 = 0; a1 < kullaniciSayisi; a1++) {
                            satir1[a1] = satir;
                            satir = buf.readLine();
                        }
                    }
                } catch (FileNotFoundException f) {
                    System.out.println("dosya yok");
                } catch (IOException ioex) {
                    System.out.println("başka bir hata oldu");
                }

                try {
                    FileInputStream fi1 = new FileInputStream("uyeParola.txt");
                    BufferedReader buf1 = new BufferedReader(new InputStreamReader(fi1));
                    String satir3;
                    while ((satir3 = buf1.readLine()) != null) {
                        for (int a2 = 0; a2 < kullaniciSayisi; a2++) {
                            satir2[a2] = satir3;
                            satir3 = buf1.readLine();

                        }
                    }
                } catch (FileNotFoundException f) {
                    System.out.println("dosya yok");
                } catch (IOException ioex) {
                    System.out.println("başka bir hata oldu");
                }

                for (int a = 0; a < satir1.length; a++) {
                    if (girilenKullaniciAdi.equals(satir1[a])) {
                        System.out.println("Parola giriniz:");
                        String girilenParola = input.next();
                        if (girilenParola.equals(satir2[a])) {
                            System.out.println("Sisteme Giriş Yaptınız.");
                        } else {
                            System.out.println("Hatalı Parola Girişi");
                        }

                    } //else {
                        //System.out.println("Girilen Kullancı Adı Hatalıdır");
                    //}
                }

                System.out.println(" ");
                System.out.println("1->Kitap Listesini Görüntüle " + "\n");
                System.out.println("2->Sistemden çıkış Yap " + "\n");
        secim = input.nextInt();

        switch (secim) {
            case 1:
                try {
                    FileInputStream fe = new FileInputStream("kitaplistesi.txt");
                    BufferedReader bof = new BufferedReader(new InputStreamReader(fe));
                    String satir3;
                    while ((satir3 = bof.readLine()) != null) {
                        System.out.println(satir3);
                    }
                } catch (FileNotFoundException f) {
                    System.out.println("dosya bulunamadı");
                }
        }
        System.out.println(" ");
        System.out.println("1->Kitap Seçimi Yap ve Sepete At " + "\n");
        System.out.println("2->Sistemden Çıkış Yap" + "\n");
        System.out.println("Seciminiz");
        secim = input.nextInt();
        switch (secim) {
            case 1:

                System.out.println("Seçmek istediğiniz kitabın ismini giriniz:");
                String alinacakKitap = input.next();

                FileInputStream fi2 = new FileInputStream("kitapAdi.txt");
                BufferedReader buf2 = new BufferedReader(new InputStreamReader(fi2));
                String satir4;
                while ((satir4 = buf2.readLine()) != null) {
                    for (int x2 = 0; x2 < kitapSayisi; x2++) {
                        kitapAdiDizisi[x2] = satir4;//kitap adı bigisi atandı
                        satir4 = buf2.readLine();

                    }
                }
                FileInputStream fi3 = new FileInputStream("kitapYazarListesi.txt");
                BufferedReader buf3 = new BufferedReader(new InputStreamReader(fi3));
                String satir5;
                while ((satir5 = buf3.readLine()) != null) {
                    for (int x3 = 0; x3 < kitapSayisi; x3++) {
                        kitapYazarDizisi[x3] = satir5;//kitap yazar adı bigisi atandı
                        satir5 = buf3.readLine();
                    }
                }
                FileInputStream fi4 = new FileInputStream("kitapTutari.txt");
                BufferedReader buf4 = new BufferedReader(new InputStreamReader(fi4));
                String satir6;
                while ((satir6 = buf4.readLine()) != null) {
                    for (int x4 = 0; x4 < kitapSayisi; x4++) {
                        kitapFiyatDizisi[x4] = satir6;//kitap fiyat bigisi atandı
                        satir6 = buf4.readLine();
                    }
                }

                for (int z1 = 0; z1 < kitapSayisi; z1++) {
                    if (alinacakKitap.equals(kitapAdiDizisi[z1])) {
                        FileWriter fileWriter3 = new FileWriter("siparisler.txt", true);
                        BufferedWriter bWriter3 = new BufferedWriter(fileWriter3);
                        bWriter3.write(kitapAdiDizisi[z1] + "," + kitapYazarDizisi[z1] + "," + kitapFiyatDizisi[z1] + "\n");
                        sepet.add(kitapAdiDizisi[z1]);
                        sepet.add(kitapYazarDizisi[z1]);
                        sepet.add(kitapFiyatDizisi[z1]);
                        sepettekiUrunSayisi++;
                        toplamTutar = kitapFiyatDizisi[z1];
                        bWriter3.close();
                        System.out.println("Kitabınız Sepete Eklendi");

                    }
                }

                System.out.println(" ");
                System.out.println(" ");
                System.out.println("1->Ödeme İşlemini Gerçekleştir" + "\n");
                System.out.println("2->Satın Alma İşlemini İptal Et" + "\n");
                System.out.println("Seciminiz");
                secim = input.nextInt();
                switch (secim) {
                    case 1:
                        FileWriter fileWriter4 = new FileWriter("odeme.txt", true);
                        BufferedWriter bWriter4 = new BufferedWriter(fileWriter4);
                        bWriter4.write("Toplam Tutar:" + toplamTutar+"\n");
                        //bWriter4.write("\n");
                        //System.out.println("toplam fiyat:"+toplamTutar);
                        //sepettekiUrunSayisi--;
                        bWriter4.close();
                        System.out.println("Odeme Islemi Basarılı Bir Sekilde Gerceklesti");

                        try {
                            FileWriter fileWriter3 = new FileWriter("odeme.txt", true);
                            BufferedWriter bWriter3 = new BufferedWriter(fileWriter3);
                            //bWriter3.write("Toplam Ödenecek Tutar:"+toplamTutar);
                            System.out.println(" ");
                            bWriter3.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        FileInputStream fi6 = new FileInputStream("odeme.txt");
                        BufferedReader buf6 = new BufferedReader(new InputStreamReader(fi6));
                        String satir8;
                        while ((satir8 = buf6.readLine()) != null) {
                            System.out.println("Toplam Tutar:" + toplamTutar);
                            satir8 = buf6.readLine();
                        }

                        break;
                }
        
                    case 2:
                        System.out.println("Sistemden Ayrıldınız");
                        System.out.println("Tekrar Görüşmek Üzere..");
                        break;
        }
        
                case2:
                System.out.println("Sistemden Çıkış Yapıldı");
                break;

            /*case 2:
                try {
                    FileInputStream fe = new FileInputStream("kitaplistesi.txt");
                    BufferedReader bof = new BufferedReader(new InputStreamReader(fe));
                    String satir3;
                    while ((satir3 = bof.readLine()) != null) {
                        System.out.println(satir3);
                    }
                } catch (FileNotFoundException f) {
                    System.out.println("dosya bulunamadı");
                }
        }
        System.out.println(" ");
        System.out.println("1->Kitap Seçimi Yap ve Sepete At " + "\n");
        System.out.println("2->Sistemden Çıkış Yap" + "\n");
        System.out.println("Seciminiz");
        secim = input.nextInt();
        switch (secim) {
            case 1:

                System.out.println("Seçmek istediğiniz kitabın ismini giriniz:");
                String alinacakKitap = input.next();

                FileInputStream fi2 = new FileInputStream("kitapAdi.txt");
                BufferedReader buf2 = new BufferedReader(new InputStreamReader(fi2));
                String satir4;
                while ((satir4 = buf2.readLine()) != null) {
                    for (int x2 = 0; x2 < kitapSayisi; x2++) {
                        kitapAdiDizisi[x2] = satir4;//kitap adı bigisi atandı
                        satir4 = buf2.readLine();

                    }
                }
                FileInputStream fi3 = new FileInputStream("kitapYazarListesi.txt");
                BufferedReader buf3 = new BufferedReader(new InputStreamReader(fi3));
                String satir5;
                while ((satir5 = buf3.readLine()) != null) {
                    for (int x3 = 0; x3 < kitapSayisi; x3++) {
                        kitapYazarDizisi[x3] = satir5;//kitap yazar adı bigisi atandı
                        satir5 = buf3.readLine();
                    }
                }
                FileInputStream fi4 = new FileInputStream("kitapTutari.txt");
                BufferedReader buf4 = new BufferedReader(new InputStreamReader(fi4));
                String satir6;
                while ((satir6 = buf4.readLine()) != null) {
                    for (int x4 = 0; x4 < kitapSayisi; x4++) {
                        kitapFiyatDizisi[x4] = satir6;//kitap fiyat bigisi atandı
                        satir6 = buf4.readLine();
                    }
                }

                for (int z1 = 0; z1 < kitapSayisi; z1++) {
                    if (alinacakKitap.equals(kitapAdiDizisi[z1])) {
                        FileWriter fileWriter3 = new FileWriter("siparisler.txt", true);
                        BufferedWriter bWriter3 = new BufferedWriter(fileWriter3);
                        bWriter3.write(kitapAdiDizisi[z1] + "," + kitapYazarDizisi[z1] + "," + kitapFiyatDizisi[z1] + "\n");
                        sepet.add(kitapAdiDizisi[z1]);
                        sepet.add(kitapYazarDizisi[z1]);
                        sepet.add(kitapFiyatDizisi[z1]);
                        sepettekiUrunSayisi++;
                        toplamTutar = kitapFiyatDizisi[z1];
                        bWriter3.close();
                        System.out.println("Kitabınız Sepete Eklendi");

                    }
                }

                System.out.println(" ");
                System.out.println(" ");
                System.out.println("1->Ödeme İşlemini Gerçekleştir" + "\n");
                System.out.println("2->Satın Alma İşlemini İptal Et" + "\n");
                System.out.println("Seciminiz");
                secim = input.nextInt();
                switch (secim) {
                    case 1:
                        FileWriter fileWriter4 = new FileWriter("odeme.txt", true);
                        BufferedWriter bWriter4 = new BufferedWriter(fileWriter4);
                        bWriter4.write("Toplam Tutar:" + toplamTutar);
                        bWriter4.write("\n");
                        //System.out.println("toplam fiyat:"+toplamTutar);
                        //sepettekiUrunSayisi--;
                        bWriter4.close();
                        System.out.println("Odeme Islemi Basarılı Bir Sekilde Gerceklesti");

                        try {
                            FileWriter fileWriter3 = new FileWriter("odeme.txt", true);
                            BufferedWriter bWriter3 = new BufferedWriter(fileWriter3);
                            //bWriter3.write("Toplam Ödenecek Tutar:"+toplamTutar);
                            System.out.println(" ");
                            bWriter3.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        FileInputStream fi6 = new FileInputStream("odeme.txt");
                        BufferedReader buf6 = new BufferedReader(new InputStreamReader(fi6));
                        String satir8;
                        while ((satir8 = buf6.readLine()) != null) {
                            System.out.println("Toplam Tutar:"+toplamTutar);
                                satir8 = buf6.readLine();
                            }
                        
                        break;

                }
            case 2:
                System.out.println("Olusturmus Oldugunuz Siparis Iptal Edilmiştir");
                System.out.println("Sistemden Ayrıldınız");
                System.out.println("Tekrar Görüşmek Üzere..");
                break;
        }*/
        }
    }
  }

