package sun.study.nio.file;

import java.io.IOException;
import java.nio.file.*;

/**
 * @author Sun Mengjie
 * @version  2018/7/11
 */
public class FileTest {

    public static void main(String[] args){

        Path path = Paths.get("E:\\readme.md");
        boolean exist = Files.exists(path,LinkOption.NOFOLLOW_LINKS);
        if(exist){

            Path bakPath = Paths.get("E:\\readme.bak");

            try {
                Files.copy(path,bakPath);
            }catch (FileAlreadyExistsException e){
             System.err.println("目标文件已存在，将要强行覆盖。。。");
                try {
                    Files.copy(path,bakPath,StandardCopyOption.REPLACE_EXISTING);
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
