class StringMethodExample{
public static void main(String[] args){
String value="Batch 20 is toxic";
String val="batch 20";
System.out.println(value.contains("toxic"));
System.out.println(value.concat(" by birth"));
System.out.println(value.equals("Batch 20 is toxic"));
System.out.println(value.equalsIgnoreCase("Batch 20 is TOXIC"));
System.out.println(value.toUpperCase());
System.out.println(value.toLowerCase());
System.out.println(value.length());
System.out.println(value.charAt(4));
System.out.println(value.compareTo(val));
System.out.println(value.compareTo("hello"));
System.out.println(value.compareToIgnoreCase(val));
System.out.println(value.indexOf('s'));
System.out.println(value.isEmpty());
System.out.println(value.replace("toxic","Vedapuu"));
System.out.println(value.substring(3,11));
System.out.println(value.trim()); //starting and ending

}
}