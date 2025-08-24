class Test {
public static void main(String[] args) {
int count = 1;
while (count <= 16) {
System.out.println(count % 2 == 1 ? "***" : "+++++");
++count;
} // end while
} // end main
} 