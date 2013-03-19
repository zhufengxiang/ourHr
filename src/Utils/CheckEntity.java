package Utils;


 
import java.io.File;
import java.io.IOException;

 

public class CheckEntity {
   //这样是不好的  不是平台式开发
     public    <T>   String  serachNameFromXml(Class<T> Entity)  {
       String	 fileName  =    Entity.getName();
        result   =  null;
       if(fileName.indexOf("com")>=0  && Entity.getPackage().getName().endsWith("po") ){
  	              result   = Entity.getSimpleName() ;
  		   }
       System.out.println(result);
  		 	 return result;
     }
    
//     private    File   file      ;
//     private  String  name  ;
     private static String  result;
     
     
     //这是直接拿到都所在包的类
//     private    void   check(String path) throws IOException{
//    	        file = new File(path);
//    	 
//    		 name   =   file.getName();
//    		 if(file.isFile()){
//    			 //判断是不是含com   po
//    		   if((name=name.substring(0,name.indexOf('.'))).equals(fileName)){
//    		   if(file.getAbsolutePath().indexOf("com")>=0  && file.getParent().endsWith("po") ){
//    	              result   = name ;
//    		   }
//    			
//    		  	 }
//    		 } else  if(file.listFiles()!=null){
//    			 //往下走
//        		 for(File  afile : file.listFiles()){
//        			 check(afile.getPath());
//        	   }
//        	 }
//  
//    		 
//    		  
////    		 System.out.println(file.listFiles());   //拿到所有的文件
//    	
//     }
//     
}
