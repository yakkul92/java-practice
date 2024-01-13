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

public class main{
  public static void main(String[] args){
    String s1 = "ssssssJava and Javascript";
    if (s1.contains("Java")){
      System.out.println("文字列s1はJavaを含んでいます");
    } 
    if (s1.endsWith("Java")){
      System.out.println("文字列s1にはJavaが末尾にあります");
    } 
    System.out.println("文字列s1で最初にJavaが登場する位置は" + s1.indexOf("Java"));
    System.out.println("文字列s1で最後にJavaが登場する位置は" + s1.lastIndexOf("Java"));
  }
}