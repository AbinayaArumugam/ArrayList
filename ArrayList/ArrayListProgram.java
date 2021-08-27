package arraylist;
import java.util.*;
import java.util.ArrayList;
public class ArrayListProgram {
 static Scanner input =new Scanner(System.in);  
//static Scanner sc = new Scanner(System.in);
 
                        //Getting Integer Input
public static int getIntegerInput(){
int number;
try {
 number = input.nextInt();
} catch(InputMismatchException e) {
System.out.println("Invalid Input.Enter valid Input");
input.next();
number = getIntegerInput();
}
return number;
}
                                        //Getting String Input
public static String getStringInput() {
String str;
str = input.next();
return str;
}

                                        //Getting Decimal Input
public static Double getDoubleInput() {
Double decValue;
try{
decValue = input.nextDouble();
} catch(InputMismatchException e) {
System.out.println("Invalid Input.Enter valid Input");
input.next();
decValue = getDoubleInput();
}
return decValue;
}

                                        //Getting Long Input
public static long getLongInput() {
long longValue;
try{
longValue = input.nextLong();
} catch(InputMismatchException e) {
System.out.println("Invalid Input.Enter valid Input");
input.next();
longValue = getLongInput();
}
return longValue;
}


                                       //Getting String Array Input
public static String[] getStringArray(int numberOfString){
String[] strArr = new String[numberOfString];
for(int i=0;i<numberOfString;i++) {
strArr[i]=input.next();
}
return strArr;
}

                                        //Getting Integer Array Input
public static int[] getIntegerArray(int numberOfInteger){
int[] num = new int[numberOfInteger];
for(int i=0;i<numberOfInteger;i++) {
num[i]=getIntegerInput();
}
return num;
}

                                          //Getting Decimal Array Input
public static Double[] getDecimalArray(int numberOfInteger){
Double[] num = new Double[numberOfInteger];
for(int i=0;i<numberOfInteger;i++) {
num[i]=getDoubleInput();
}
return num;
}


                                            //Getting Long Array Input
public static Long[] getLongArray(int numberOfInteger){
Long[] num = new Long[numberOfInteger];
for(int i=0;i<numberOfInteger;i++) {
num[i]=getLongInput();
}
return num;
}

                                              //Creating String ArrayList
public static List<String> createStringArrayList(String[] strArr){
List<String> array = new ArrayList<String>();
for(int i=0;i<strArr.length;i++){
array.add(strArr[i]);
}
return array;
}

                                             //Creating Integer ArrayList
public static List<Integer> createIntegerArrayList(int[] num){
List<Integer> arrayInt = new ArrayList<Integer>();
for(int i=0;i<num.length;i++){
arrayInt.add(num[i]);
}
return arrayInt;
}
   
                                               //Creating Decimal ArrayList
public static List<Double> createDecimalArrayList(Double[] num){
List<Double> decArray = new ArrayList<Double>();
for(int i=0;i<num.length;i++){
decArray.add(num[i]);
}
return decArray;
}

                                               //Creating Long ArrayList
public static List<Long> createLongArrayList(Long[] num){
List<Long> longArray = new ArrayList<Long>();
for(int i=0;i<num.length;i++){
longArray.add(num[i]);
}
return longArray;
}

                                       //Create ArrayList for Strings with input
public static List<String> createStrArrayList() {
System.out.println("Enter the number of Strings: ");
int numberOfString=getIntegerInput();
System.out.println("Enter the Strings: ");
String[] strArr = getStringArray(numberOfString);
List<String> array=createStringArrayList(strArr);
return array;
}

                                               //Create ArrayList for Integer with input
public static List<Integer> createIntArrayList() {
System.out.println("Enter the number of Integer: ");
int numberOfInteger=getIntegerInput();
System.out.println("Enter the integer values: ");
int[] intArr = getIntegerArray(numberOfInteger);
List<Integer> array=createIntegerArrayList(intArr);
return array;
}



                                        //Create ArrayList with Decimal with input
public static List<Double> createDecArrayList() {
System.out.println("Enter the number of Decimal input: ");
int numberOfDecimal=getIntegerInput();
System.out.println("Enter the Decimal values: ");
Double[] decValue = getDecimalArray(numberOfDecimal);
List<Double> array=createDecimalArrayList(decValue);
return array;
}

                                         //Creating ArrayList with Long with input
public static List<Long> createLongArrList(){
System.out.println("Enter the number of Inputs: ");
int numberOfInput=getIntegerInput();
System.out.println("Enter the Values: ");
Long[] longValue = getLongArray(numberOfInput);
List <Long> array = createLongArrayList(longValue);
return array;
}
                                        //Creating ArrayList to add various ArrayList
public static List<Object> createGroupArrayList(List<String> strArr,List<Integer> intArr,List<Employee> cusObj){
if(strArr==null||intArr==null||cusObj==null) {
return null;
}
List<Object> groupList = new ArrayList<Object>();
 groupList.add(intArr);
 groupList.add(strArr);
 groupList.add(cusObj);
return groupList;
}

                                            //Print ArrayList Size
public static int arrayListSize(List<String> array1) {
int size = array1.size();
return size;
}

                                          


                                            //Custom Object
public static List<Employee> createCustomObject(){
List<Employee> eList = new ArrayList<>();
System.out.println("Enter the No of Employee: ");
int size = getIntegerInput();
for(int i=0;i<size;i++) {
System.out.println("Enter the Employee No: ");
int id= getIntegerInput();
System.out.println("Enter the Name: ");
String name =getStringInput();
System.out.println("Enter the Age: ");
int age= getIntegerInput();
System.out.println("Enter the City: ");
String city= getStringInput();

Employee emp = new Employee();
   emp.setId(id);
   emp.setName(name);
   emp.setCity(city);
   eList.add(emp);
   }
return eList;
   }

                                             //Find First index of String in arrayList
public static int findIndexOf(List<String> array,String str){
if(array==null) {
return -1;
}
int index= array.indexOf(str);
return index;
}

                                            //Find Last index of String in arrayList
public static int findLastIndexOf(List<String> array,String str){
if(array==null) {
return -1;
}
int index =array.lastIndexOf(str);
return index;
}

                                             //Insert string in arraylist
public static List<String> insertString(List<String> array,int index,String str) throws IndexOutOfBoundsException{
if(array==null) {
return null;
}
if(index<=array.size()){
array.add(index,str);
} else {
//System.out.println("InValid.Check the Array");
throw new IndexOutOfBoundsException();
}
return array;
}

                                            //Creating sublist of array with index
public static List<String> createSubList(List<String> array,int startIndex,int endIndex)  throws IndexOutOfBoundsException{
List<String> newList = new ArrayList<String>();
if(array==null) {
return null;
}
if(startIndex<endIndex && endIndex<=array.size()) {
newList=array.subList(startIndex,endIndex);
} else {
//System.out.println("Invalid. Check the Array");
throw new IndexOutOfBoundsException();
}
return newList;
}

                                            //Creating new Array and multiple arrays to it.
public static List<String> createNewArrayList(List<String> array1,List<String> array2){
if(array1==null || array2==null) {
return null;
}
List<String> arr = new ArrayList<>();
arr.addAll(array1);
arr.addAll(array2);
return arr;
}

                                            //Remove a value from arraylist by passing value
public static List removeWithValue(List<Double> array, Double decValue) {
if(array==null) {
return null;
}
array.remove(decValue);
return array;
}

                                           //Remove a value from arraylist by passing index
public static List removeWithIndex(List<Double> array,int index)throws IndexOutOfBoundsException{
if(array==null) {
return null;
}
if(index<array.size()){
array.remove(index);
}else{
//System.out.println("Invalid. Check the Input");
throw new IndexOutOfBoundsException();
}
return array;
}

                                          //Remove values by giving range of index
public static List removeWithRange(List<Long> array,int startIndex,int endIndex) throws IndexOutOfBoundsException {
if(array==null) {
return null;
}
if(startIndex<endIndex && endIndex<=array.size()){
array.subList(startIndex,endIndex).clear();
} else {
//System.out.println("Invalid.Check the input");
throw new IndexOutOfBoundsException();
}
return array;
}

                                  //Print without elements which is present in another arraylist
public static List removeCommonElements(List<String> firstArr,List<String> secondArr) {
if(firstArr==null || secondArr==null){
return null;
}
firstArr.removeAll(secondArr);
return firstArr;
}

                                      //Printing elements which is present in another arraylist
public static List removeUniqueElements(List<String> firstArr,List<String> secondArr) {
if(firstArr==null || secondArr==null){
return null;
}
firstArr.retainAll(secondArr);
return firstArr;
}

                                            //Delete all the element from the arraylist
public static List deleteAllElements(List<Long> array){
if(array==null) {
return null;
}
array.clear();
return array;
}

                                               //Check the ArrayList for the String
public static boolean checkListForString(List<String> array,String str){
if(array==null) {
return false;
}
return array.contains(str);
}

                                               //Main method
public static void main(String[] args) {
System.out.println("Enter the Question number: ");
int QuestionNo = getIntegerInput();
switch (QuestionNo) {
case 1: 
List<String> array1 = new ArrayList<>();
System.out.println("Size of the ArrayList: "+arrayListSize(array1));
break;
case 2:
List<String> array2 = createStrArrayList(); 
System.out.println("List of array: "+array2);
System.out.println("Size of the ArrayList: "+arrayListSize(array2));
break;
case 3:
List<Integer> array3=createIntArrayList();
System.out.println("List of array: "+array3);
System.out.println("Size of the ArrayList: "+array3.size());
break;
case 4:
List<Employee> array4=createCustomObject();
for(int i=0;i<array4.size();i++) {
System.out.println(array4.get(i));
}
break;
case 5:
List<Integer> intArray=createIntArrayList();
List<String> strArray=createStrArrayList();
List<Employee> cusObj=createCustomObject();
List<Object> array5=createGroupArrayList(strArray,intArray,cusObj);
System.out.println("List of array: "+array5);
System.out.println("Size of the ArrayList: "+array5.size());
break;
case 6:
List<String> array6=createStrArrayList();
System.out.println("List of array: "+array6);
System.out.println("Size of the ArrayList: "+arrayListSize(array6));
System.out.println("Enter the String to find index: ");
String findIndex=getStringInput();
System.out.println("Index of String: "+findIndexOf(array6,findIndex));
break;
case 7:
List<String> array7=createStrArrayList();
System.out.println("print using Iterator: ");
Iterator it = array7.iterator();
while (it.hasNext()) {
System.out.print(it.next()+ " ");
}
System.out.println();
System.out.println("print using for loop: ");
for(int i=0;i<array7.size();i++) {
System.out.print(array7.get(i)+ " ");
}
break;
case 8:
List<String> array8=createStrArrayList();
System.out.println("List of array: "+array8);
System.out.println("Size of the ArrayList: "+arrayListSize(array8));
System.out.println(" Enter the Index to print the String: ");
int index8=getIntegerInput();
if(arrayListSize(array8)>index8) {
System.out.println(array8.get(index8));
} else {
System.out.println("Invalid input.Index out of bound.Try Again");
}
break;
case 9:
List<String> array9=createStrArrayList();
System.out.println("List of array: "+array9);
System.out.println("Size of the ArrayList: "+arrayListSize(array9));
System.out.println("Enter the String to find index: ");
String findIndex9=getStringInput();
System.out.println("First Index of String: "+findIndexOf(array9,findIndex9));
System.out.println("Last Index of String: "+findLastIndexOf(array9,findIndex9));
break;
case 10:
List<String> array10=createStrArrayList();
System.out.println("Enter the postion to insert: ");
int index10=getIntegerInput();
System.out.println("Enter the string to insert: ");
String str10=getStringInput();
try{
System.out.println("List of Strings: "+insertString(array10,index10,str10));
} catch(IndexOutOfBoundsException e){
System.out.println("You have entered Incorrect Index.Try Again");
}
System.out.println("Size of the ArrayList: "+arrayListSize(array10));
break;
case 11:
List<String> array11=createStrArrayList();
System.out.println("Enter the start Index and end Index: ");
int startIndex11=getIntegerInput();
int endIndex11=getIntegerInput();
try{
System.out.println("List of array: "+createSubList(array11,startIndex11,endIndex11));
} catch (IndexOutOfBoundsException e){
System.out.println("You have entered Incorrect Index.Try Again");
}
System.out.println("Size of the ArrayList: "+array11.size());
break;
case 12:
List<String> firstArray12=createStrArrayList();
List<String> secondArray12=createStrArrayList();
List<String> thirdArray12= createNewArrayList(firstArray12,secondArray12);
System.out.println("List: "+thirdArray12);
System.out.println("Length of the third Array: "+thirdArray12.size());
break;
case 13:
List<String> firstArray13=createStrArrayList();
List<String> secondArray13=createStrArrayList();
List<String> thirdArray13=createNewArrayList(secondArray13,firstArray13);
System.out.println("List: "+thirdArray13); 
System.out.println("Length of the third Array: "+thirdArray13.size());
break;
case 14:
List<Double> decimalArray14 = createDecArrayList();
System.out.println("Enter the value to be removed: ");
Double deleteValue= getDoubleInput();
System.out.println(removeWithValue(decimalArray14,deleteValue));
System.out.println("Size of the ArrayList: "+decimalArray14.size());
break;
case 15:
List<Double> decimalArray15 = createDecArrayList();
System.out.println("Enter the index to be removed: ");
int index= getIntegerInput();
try{
System.out.println(removeWithIndex(decimalArray15,index));
} catch (IndexOutOfBoundsException e){
System.out.println("You have entered Incorrect Index.Try Again");
}
System.out.println("Size of the ArrayList: "+decimalArray15.size());
break;
case 16:
List<Long> longArray16 = createLongArrList();
System.out.println("Enter the start index and end index to be removed: ");
int startIndex= getIntegerInput();
int endIndex= getIntegerInput();
try{
System.out.println("List of array: "+removeWithRange(longArray16,startIndex,endIndex));
} catch (IndexOutOfBoundsException e){
System.out.println("You have entered Incorrect Index.Try Again");
}
System.out.println("Size of the ArrayList: "+longArray16.size());
break;
case 17:
List<String> firstArray17=createStrArrayList();
List<String> secondArray17=createStrArrayList();
System.out.println(removeCommonElements(firstArray17,secondArray17));
System.out.println("Length of the Arraylist: "+firstArray17.size());
break;
case 18:
List<String> firstArray18=createStrArrayList();
List<String> secondArray18=createStrArrayList();
System.out.println(removeUniqueElements(firstArray18,secondArray18));
System.out.println("Length of the Arraylist: "+firstArray18.size());
break;
case 19:
List<Long> longArray19 = createLongArrList();
System.out.println("ArrayList is cleared ");
System.out.println("List: "+deleteAllElements(longArray19));
System.out.println("Length of the ArrayList: "+longArray19.size());
break;
case 20:
List<String> array20=createStrArrayList();
System.out.println("Enter the String to check");
String str20 = getStringInput();
System.out.println(checkListForString(array20,str20));
System.out.println("List: "+array20);
System.out.println("Length of the ArrayList: "+array20.size());
break;
default:
System.out.println("Invalid");
break;
}
}
public static void closeScanner() {
input.close();
}
}

 


