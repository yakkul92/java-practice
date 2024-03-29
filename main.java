// public class main{
//   public static void main(String[] args){
//     System.out.println("Hello World");
//   }
// }

// public class main{
//   public static void main(String[] args){
//     String s1 = "すっきりjava";
//     String s2 = "Java";
//     String s3 = "java";
//     // 内容が正しいか調べる
//     if (s2.equals(s3)){
//       System.out.println("s2とs3は等しい");
//     }
//     // 内容が正しいか調べる文字サイズケースなし
//     if (s2.equalsIgnoreCase(s3)){
//       System.out.println("s2とs3はケースを区別しなければ同じです");
//     }
//     // 文字列長、空文字検索
//     System.out.println("s1の長さは" + s1.length() + "です");
//     if (s1.isEmpty()) {
//       System.out.println("s1は空文字です");
//     }
//   }
// }

// public class main{
//   public static void main(String[] args){
//     String s1 = "ssssssJava and Javascript";
//     if (s1.contains("Java")){
//       System.out.println("文字列s1はJavaを含んでいます");
//     }
//     if (s1.endsWith("Java")){
//       System.out.println("文字列s1にはJavaが末尾にあります");
//     }
//     System.out.println("文字列s1で最初にJavaが登場する位置は" + s1.indexOf("Java"));
//     System.out.println("文字列s1で最後にJavaが登場する位置は" + s1.lastIndexOf("Java"));
//   }
// }

// // 文字列切り出しメソッド
// public class main{
//   public static void main(String[] args){
//     String s1 = "Java programing";
//     System.out.println("文字列s1の４文字目以降は" + s1.substring(3));
//     System.out.println("文字列s1の４～７文字目は" + s1.substring(3, 8));
//     // ８文字目は含まれない
//   }
// }

// public class main{
//   public static void main(String[] args){
//     StringBuilder sb = new StringBuilder();
//     for (int i = 0; i < 10; i++){
//       sb.append("Java");
//     }
//     String s = sb.toString();
//   }
// }

// // 配列として保存して出力できる
// public class main{
//   public static void main(String[] args){
//     String s = "abc,def:ghi";
//     String[] words = s.split("[,:]");
//     for (String w : words){
//       System.out.println(w + "->");
//     }
//   }
// }

// // 正規表現パターンを使って置換
// public class main{
//   public static void main(String[] args){
//     String s = "abc,def:ghi";
//     String w = s.replaceAll("[beh]", "X");
//     System.out.println(w);
//   }
// }

// 1から100までの整数をカンマで連結したりなんだり
// public class main{
//   public static void main(String[] args){
//     StringBuilder sb = new StringBuilder();
//     for (int i =0; i<100; i++){
//       sb.append(i+1).append(",");
//     }
//     String s = sb.toString();
//     String[] a = s.split(",");

//     // 配列の各要素をループして出力
//     for (String element : a) {
//       System.out.print(element + " ");
//     }
//     System.out.println();

//     // 特定の要素を指定して取り出し、出力
//     int indexToRetrieve = 2; // 例として3番目の要素を取り出す場合
//     if (indexToRetrieve >= 0 && indexToRetrieve < a.length) {
//       String specificElement = a[indexToRetrieve];
//       System.out.println("特定の要素: " + specificElement);
//     } else {
//       System.out.println("指定されたインデックスは配列の範囲外です。");
//     }

//   }
// }

// import java.text.SimpleDateFormat;
// import java.util.Calendar;
// import java.util.Date;
// public class main{
//   public static void main(String[] args){
//     // 現在の日時をDate型で取得
//     Date now = new Date();

//     // Calendarにセット
//     Calendar c = Calendar.getInstance();
//     c.setTime(now);

//     // 取得した値に100を足してCalendarの日にセット
//     int day = c.get(Calendar.DAY_OF_MONTH);
//     day += 100;
//     c.set(Calendar.DAY_OF_MONTH, day);
//     // Calendarの日付情報をDate型に変換

//     Date future = c.getTime();
//     SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
//     System.out.println(f.format(future));
//   }
// }


// // java.timeパッケージの利用
// import java.time.*;
// import java.time.format.*;
// public class main{
//   public static void main(String[] args){
//     LocalDate now = LocalDate.now();
//     LocalDate future = now.plusDays(100);
//     DateTimeFormatter f = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
//     System.out.println(future.format(f));
//   }
// }

// import java.time.LocalDate;
// public class LocalDateExample {
//     public static void main(String[] args) {
//         // 現在の日付を取得
//         LocalDate today = LocalDate.now();
//         System.out.println("現在の日付: " + today);

//         // 2024年1月18日を表すLocalDateオブジェクトを作成
//         LocalDate specificDate = LocalDate.of(2024, 1, 18);
//         System.out.println("指定した日付: " + specificDate);

//         // 特定の日数を加算して新しい日付を作成
//         LocalDate futureDate = today.plusDays(30);
//         System.out.println("30日後の日付: " + futureDate);
//     }
// }

// // 拡張for文
// import java.util.ArrayList;

// public class main{
//   public static void main(String[] args){
//     ArrayList<Integer> points = new ArrayList<Integer>();
//     points.add(10);
//     points.add(80);
//     points.add(75);
//     for(int i : points){
//       System.out.println(i);
//     }
//   }
// }

// // イテレータ使用例
// import java.util.*;
// public class main{
//   public static void main(String[] args){
//     ArrayList<String> names = new ArrayList<String>();
//     names.add("a");
//     names.add("b");
//     names.add("c");
//     Iterator<String> it = names.iterator();
//     while(it.hasNext()){
//       String e = it.next();
//       System.out.println(e);
//     }
//   }
// }

// // setでの実装
// import java.util.Set;
// import java.util.TreeSet;

// public class main{
//   public static void main(String[] args){
//     Set<String> words = new TreeSet<String>();
//     words.add("a");
//     words.add("b");
//     words.add("c");
//     for (String s :words){
//       System.out.print(s + "→");
//     }
//   }
// }

// // Mapの実装
// import java.util.*;
// public class main{
//   public static void main(String[] args){
//     Map<String, Integer> prefs = new HashMap<String, Integer>();
//     prefs.put("a", 255);
//     prefs.put("b", 1261);
//     prefs.put("c", 181);
//     int a = prefs.get("a");
//     System.out.println("a=" + a);
//     prefs.remove("b");
//     prefs.put("c", 222);
//     int c = prefs.get("c");
//     System.out.println("c=" + c);
//   }
// }

// // mapをつかって1個ずつ取り出す
// import java.util.*;
// public class main{
//   public static void main(String[] args){
//     Map<String, Integer> prefs = new HashMap<String, Integer>();
//     prefs.put("京都", 255);
//     prefs.put("東京", 1261);
//     prefs.put("熊本", 182);
//     for (String key : prefs.keySet()){
//       int value = prefs.get(key);
//       System.out.println(key + "の人口は" + value);
//     }
//   }
// }

// import java.util.*;

// public class hero{
//   private String name;
//   public Hero(String name){ this.name = name; }
//   public String getName(){ return this.name }
// }

// public class main{
//   public static void main(String[] args){
//     hero h1 = new hero("斎藤");
//     hero h2 = new hero("鈴木");
//     List<hero> heroes = new ArrayList<hero>();
//     heroes.add(h1);
//     heroes.add(h2);
//     for(hero h : heroes){
//       System.out.println(h.getName());
//     }
//   }
// }

// // Map使い方
// import java.util.*;
// public class main{
//   public static void main(String[] args){
//     hero h1 = new hero("鈴木");
//     hero h2 = new hero("斎藤");
//     Map<hero, Integer> heroes = new HashMap<hero, Integer>();
//     heroes.put(h1, 3);
//     heroes.put(h2, 7);
//     for (hero key : heroes.keySet()){
//       int value =heroes.get(key);
//       System.out.println(key.getName() + "が倒したのは" + value);
//     }
//   }
// }

// public class StrongBox<E>{
//   private E item;
//   public void puts(E, i){
//     this.item = i;
//   }
//   public E get(){
//     return this.item;
//   }
// }

// enum keytype{ PADLOCK, BUTTOM, DIAL, FINGER; }

// public class StringBox<E>{
//   private KeyType keyType;
//   private E item;
//   private long count; 
//   public Strongbox(Keytype key){
//     this.keyType = key;
//   }
//   public void put(E, i){
//     this.item = i;
//   }
//   public E get(){
//     this.count++;
//     switch(this.keyType){
//       case PADLOCK;
//       if (count < 1024) return null;
//       break;
//       case BUTTON;
//       if (count < 10000) return null;
//       break; 
//       case DIAL;
//       if (count < 30000) return null;
//       break; 
//       case FINGER;
//       if (count < 100000) return null;
//       break; 
//     }
//     this.count = 0;
//     return this.item; 
//   }
// }

// **************************
// ファイルコピープログラム作成
// java.input,outputパッケージ
// import java.io.*;

// public class main{
//   public static void main(String[] args) throws Exception{
//     String inFile = args[0];
//     String outFile = args[1];
//     FileInputStream fis = new FileInputStream(inFile);
//     FileOutputStream fos = new FileOutputStream(outFile);
//     int i = fis.read();
//     while(i != -1){
//       fos.write(i); i =fis.read();
//     }
//     fos.flush();
//     fos.close();
//     fis.close();
//   }
// }


// ファイル圧縮プログラム作成
// import java.io.*;
// import java.util.zip.GZIPOutputStream;

// public class main{
//   public static void main(String[] args){
//     String inFile  = args[1];
//     String outFile = args[2];
//     FileInputStream fis = null;
//     GZIPOutputStream gzos = null;
//     try{
//       fis = new FileInputStream(inFile);
//       FileOutputStream fos = new FileOutputStream(outFile);
//       BufferedOutputStream bos = new BufferedOutputStream(fos);
//       gzos = new GZIPOutputStream(bos);
//       int i = fis.read();
//       while(i != -1){
//         gzos.write(i);
//         i = fis.read();
//       }
//       gzos.flush();
//       gzos.close();
//       fis.close();
//     }catch(IOException e){
//       System.err.println("ファイル操作に失敗しました");
//       try{
//         if(fis != null){
//           fis.close();
//         }
//         if (gzos != null) {
//           gzos.close();
//         }
//       }catch(IOException ee) {}
//     }
//   }
// }

// 改良バージョン
import java.io.*;
import java.util.zip.GZIPOutputStream;

public class main {
    public static void main(String[] args) {
        if (args.length < 2) {
          System.err.println("入力ファイルと出力ファイルのパスを指定してください");
          return;
      }
      
        String inFile = args[0];
        String outFile = args[1];      

        // 出力ディレクトリの存在確認と作成
        File outputDir = new File(outFile).getParentFile();
        if (outputDir != null && !outputDir.exists()) {
            outputDir.mkdirs();
        }        

        FileInputStream fis = null;
        GZIPOutputStream gzos = null;

        try {
            fis = new FileInputStream(inFile);
            FileOutputStream fos = new FileOutputStream(outFile);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            gzos = new GZIPOutputStream(bos);

            int i = fis.read();
            while (i != -1) {
                gzos.write(i);
                i = fis.read();
            }

            gzos.flush();
        } catch (IOException e) {
            System.err.println("ファイル操作に失敗しました");
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (gzos != null) {
                    gzos.close();
                }
            } catch (IOException ee) {
                ee.printStackTrace();
            }
        }
    }
}