
public class sem_2 {
    // private static final float TIME = 0;
  public static void main(String[] args) {
 
    // String str  = "HeLLo";
    // str  = str.replace("LL" , "oo");
    // StringBuilder builder = new StringBuilder("HeLLo");
    // str  =builder.toString();
    // builder.append(true);
    
    // builder.append(true).append("!=").append(false);
    // builder.deleteCharAt(0);
    // builder.delete(0, 0)
    // builder.reverse()
    // builder.indexOf(str)
    // builder.replace(0, 0, str)
    // builder.insert(builder.length()/2, 7.34f);
      //builder.toString.contains(bilder.toString);
    // System.out.println(builder);
//     String str = "";
//     StringBuilder builder = new StringBuilder();
//     long begin = System.currentTimeMillis();
//     // System.nanoTime()
// for (int i = 0; i< 1000; i++){
//     str+= Character.getName(i);
// }
//     long end = System.currentTimeMillis();
//     System.out.println(end-begin);

//     begin = System.currentTimeMillis();
//     for (int i = 0; i< 1000; i++){
//       builder.append(Character.getName(i)) ;
// }
//     end = System.currentTimeMillis();
//     System.out.println(end-begin);
//     //Если надо работать с консолью Scanner
// Задача 1.
// Написать программу, в которой будет вводится вручную две строчки, 
// далее будет сравнение этих строк и говорить, есть ли в первой строке 
// элементы другой строки.

// Scanner scanner = new Scanner (System.in);
//     System.out.print("Ведите строку: ");
//      //перевели, что бы был не класс строка, а класс bilder
//      StringBuilder strOne = new StringBuilder(scanner.nextLine()); //одной строчкой инициализировали и засунули в StringBuilder строчку, которую ввел пользоватль
//      System.out.println(strOne);
//     System.out.println("Ведите вторую строку: ");
//     StringBuilder strTwo = new StringBuilder(scanner.nextLine()); //одной строчкой инициализировали и засунули в StringBuilder строчку, которую ввел пользоватль
//      System.out.println(strTwo);
// // что бы проверить есть ли одинаковые элементы в строках
//     // порверяем по условию
//     if(strOne.toString().contains(strTwo.toString())) {
      
// // Задача 2.
//     // Находим в одной строке другую и если находим ее, 
//     // то меняем надписью “найденая строка заменена на другую”, 
//    // если не находим, “совпадений ненайдено”. 
      
//    //если strOne содержит strTwo, то получается в strOne приминяем метод replase
//    //и меняем strTwo на фразу 
//    // и потом всю эту строчку обернуть в System.out.println 
//     //     System.out.println(strOne.toString().replace(strTwo.toString() ,"найденая строка заменена на другую"));
//     // }
//     //     else  System.out.println("совпадений ненайдено");

// // Задача 3.
// // Если сравнивали contains(strTwo.toString, теперь надо сравнить contains bilder
//         int startindex = strOne.indexOf(strTwo.toString()); 
//         System.out.println(startindex);
//         int endindex = startindex + strTwo.length();
//         System.out.println(endindex);
//         System.out.println(strOne.replace(startindex, endindex, "Что надо было написать ?"));
//         }
//             else  System.out.println("совпадений ненайдено");
  
   
// StringBuilder strOne = new StringBuilder("Hello world");
// String strTwo = "Hello world";
// long begin = System.currentTimeMillis();
// System.out.println(strOne.replace(0, 0, strTwo)); // заменить например какие то буквы, это делали на семинаре
// long end = System.currentTimeMillis();
// System.out.println(end-begin);


//тренировка
StringBuilder str = new StringBuilder("Hello=world");
System.out.println(str.toString());
//метод append
// str.append(" word ").append(" ! ").append(" & ");
// str.append(" word " + " " +" ! " + " "+" & ");
// System.out.println(str);

//метод revers
// StringBuilder reverseStr = str.reverse();
// System.out.println(reverseStr.toString());


//метод IndexOf
// int index = str.indexOf("=");
// System.out.println(index);

//метод deliteCharAt(0)
// StringBuilder delitestr = str.deleteCharAt(5);
// System.out.println(delitestr);

//метод insert
// str.insert(5, " равно ");
// System.out.println(str);

//метод replase
str.replace(5, 6, " равно ");
System.out.println(str.toString());

}

  

    public static void main(String[] args) {

    // 1.Напишите программу, чтобы найти вхождение в строке 
    //(содержащей все символы другой строки).
  
   Scanner scanner = new Scanner(System.in);
   System.out.print("Ведите строку: ");
   StringBuilder str1 = new StringBuilder(scanner.nextLine()); 
   System.out.println(str1);
   System.out.print("Ведите строку: ");
   StringBuilder str2 = new StringBuilder(scanner.nextLine()); 
   System.out.println(str2);
   if(str1.toString().contains(str2.toString())){
    System.out.println("строка содержит все символы");
   }
   else System.out.println("не содержит все символы");
   
    // 2.Напишите программу, чтобы проверить, являются ли две данные 
    //строки вращением друг друга (вхождение в обратном порядке).
    StringBuilder str2rev = str2.reverse();
    if(str1.toString().equals(str2.toString())){
        System.out.println("строки являются вращением друг друга");
       }
       else System.out.println("строки не являются вращением друг друга");

    // 3.*Напишите программу, чтобы перевернуть строку с помощью рекурсии.
    // 4.Дано два числа, например 3 и 56, необходимо составить следующие 
    //строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 
    // Используем метод StringBuilder.append().
    System.out.println("\\\\");
    StringBuilder num1 = new StringBuilder("3");
    StringBuilder num2 = new StringBuilder("56");
    StringBuilder plus = num1.append("+").append(num2).append("=").append("59");
    System.out.println (plus);
    num1 = new StringBuilder("3");
    num2 = new StringBuilder("56");
    StringBuilder minus = num1.append("-").append(num2).append("=").append("-53");
    System.out.println (minus);
    num1 = new StringBuilder("3");
    num2 = new StringBuilder("56");
    StringBuilder multiply = num1.append("*").append(num2).append("=").append("-53");
    System.out.println (multiply);
    // 5.Замените символ “=” на слово “равно”. Используйте методы 
    // StringBuilder.insert(),StringBuilder.deleteCharAt().
    int index = multiply.indexOf("=");
    System.out.println(index);
    StringBuilder delitestr = multiply.deleteCharAt(5);
    System.out.println(delitestr);
    multiply.insert(5, " равно ");
    System.out.println(multiply);

    // 6.Замените символ “=” на слово “равно”. Используйте методы 
    // StringBuilder.replace().
    multiply.replace(5, 6, " равно ");
        System.out.println(multiply.toString());

    // *Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.
    // это задание я не понял как делать

   }  
}