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
public class main{
  public static void main(String[] args){
    StringBuilder sb = new StringBuilder();
    for (int i =0; i<100; i++){
      sb.append(i+1).append(",");
    } 
    String s = sb.toString();
    String[] a = s.split(",");
    
    // 配列の各要素をループして出力
    for (String element : a) {
      System.out.print(element + " ");
    }
    System.out.println();

    // 特定の要素を指定して取り出し、出力
    int indexToRetrieve = 2; // 例として3番目の要素を取り出す場合
    if (indexToRetrieve >= 0 && indexToRetrieve < a.length) {
      String specificElement = a[indexToRetrieve];
      System.out.println("特定の要素: " + specificElement);
    } else {
      System.out.println("指定されたインデックスは配列の範囲外です。");
    }
    
  }
}