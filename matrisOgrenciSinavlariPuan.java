package A000_denemelerim;

import java.util.Scanner;
import java.util.Random;

public class matrisOgrenciSinavlariPuan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("Kac tane ogrenci var? : ");
        int ogrenciSayisi = input.nextInt();
        System.out.println("Kac tane sinava girdiler?");
        int sinavSayisi = input.nextInt();
        int[][] notlar = new int[ogrenciSayisi][sinavSayisi];

        for (int i = 0; i < ogrenciSayisi; i++) {
            for (int j = 0; j < sinavSayisi; j++) {
                notlar[i][j] = rnd.nextInt(100);
            }
        }

        System.out.print("\t");
        for (int i = 0; i < sinavSayisi; i++) {
            System.out.print("\t \t" + (i + 1) + ".Sinav"); // Başlıkları yaz
        }
        System.out.println();

        for (int i = 0; i < ogrenciSayisi; i++) {
            System.out.print((i + 1) + ". Ogrenci : ");
            for (int j = 0; j < sinavSayisi; j++) {
                System.out.print("\t\t" + notlar[i][j]);
            }
            System.out.println();
        }

        double[] ogrenciToplamPuan = new double[ogrenciSayisi];
        for (int i = 0; i < ogrenciSayisi; i++) {
            for (int j = 0; j < sinavSayisi; j++) {
                ogrenciToplamPuan[i] += (double) notlar[i][j];
            }
        }
        for (int i = 0; i < ogrenciSayisi; i++) {
            System.out.println((i + 1) + ". Ogrencinin ortalamasi : " + (ogrenciToplamPuan[i] / sinavSayisi));
        }

        double[] sinavToplamPuan = new double[sinavSayisi];
        for (int i = 0; i < sinavSayisi; i++) {
            for (int j = 0; j < ogrenciSayisi; j++) {
                sinavToplamPuan[i] += (double) notlar[j][i];
            }
        }
        for (int i = 0; i < sinavSayisi; i++) {
            System.out.println((i + 1) + ". Sinavin sinif ortalamasi : " + (sinavToplamPuan[i] / ogrenciSayisi));
        }

        int[] ogrenciEnYuksekNot = new int[ogrenciSayisi];
        int[] ogrenciEnDusukNot = new int[ogrenciSayisi];
        for (int i = 0; i < ogrenciSayisi; i++) {
            ogrenciEnYuksekNot[i] = notlar[i][0];
            ogrenciEnDusukNot[i] = notlar[i][0];
            for (int j = 0; j < sinavSayisi; j++) {
                if (notlar[i][j] > ogrenciEnYuksekNot[i]) {
                    ogrenciEnYuksekNot[i] = notlar[i][j];
                }
                if (notlar[i][j] < ogrenciEnDusukNot[i]) {
                    ogrenciEnDusukNot[i] = notlar[i][j];
                }
            }
        }
        for (int i = 0; i < ogrenciSayisi; i++) {
            System.out.println((i + 1) + ". Ogrencinin en yuksek sinav puani : " + ogrenciEnYuksekNot[i]);
        }

        for (int i = 0; i < ogrenciSayisi; i++) {
            System.out.println((i + 1) + ". Ogrencinin en dusuk sinav puani : " + ogrenciEnDusukNot[i]);
        }

        int[] sinavBirincisiOgrenci = new int[sinavSayisi];
        int[] sinavSonuncusuOgrenci = new int[sinavSayisi];
        int[] sinavEnYuksek = new int[sinavSayisi];
        int[] sinavEnDusuk = new int[sinavSayisi];
        for (int i = 0; i < sinavSayisi; i++) {
            sinavBirincisiOgrenci[i] = 0;
            sinavSonuncusuOgrenci[i] = 0;
            sinavEnYuksek[i] = notlar[0][i];
            sinavEnDusuk[i] = notlar[0][i];
            for (int j = 0; j < ogrenciSayisi; j++) {
                if (sinavEnYuksek[i] < notlar[j][i]) {
                    sinavEnYuksek[i] = notlar[j][i];
                    sinavBirincisiOgrenci[i] = j;
                }
                if (sinavEnDusuk[i] > notlar[j][i]) {
                    sinavEnDusuk[i] = notlar[j][i];
                    sinavSonuncusuOgrenci[i] = j;
                }
            }
        }
        for (int i = 0; i < sinavSayisi; i++) {
            System.out.println((i + 1) + ". Sinavin en yuksek puani : " + sinavEnYuksek[i] + " (Alan: " + (sinavBirincisiOgrenci[i] + 1) + ". Ogrenci)");
        }

        for (int i = 0; i < sinavSayisi; i++) {
            System.out.println((i + 1) + ". Sinavin en dusuk puani : " + sinavEnDusuk[i] + " (Alan: " + (sinavSonuncusuOgrenci[i] + 1) + ". Ogrenci)");
        }
    }
}
