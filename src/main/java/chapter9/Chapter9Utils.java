package chapter9;

public class Chapter9Utils {
  public static String[] getDirPath(String[] base, String... args) {
//     System.out.println("base: "+base.length+", args: "+args.length);
     String[] path = new String[base.length+args.length];
     for (int i = 0; i<base.length; i++)
       path[i] = base[i];
     for (int i = base.length; i<(base.length+args.length); i++)
       path[i] = args[i-base.length];
//     System.out.print("path: ");
//     for (int i = 0; i<path.length; i++)
//       System.out.print("/"+path[i]);
//     System.out.println();
     return path; 
  }
}
