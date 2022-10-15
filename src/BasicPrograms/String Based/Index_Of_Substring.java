import java.util.*;
import java.lang.*;
import java.io.*;
 
class Index_Of_Substring {
  public static void main(String[] args) {
    String text = "takeuforward";
    String pattern = "forward";
 
    int foundIdx = text.indexOf(pattern);
 
    System.out.println("The substring starts from the index: "+foundIdx);
  }
}