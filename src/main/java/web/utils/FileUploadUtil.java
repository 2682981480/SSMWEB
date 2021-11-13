package web.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

public class FileUploadUtil {

	@SuppressWarnings("deprecation")
	public static String upload(MultipartFile picture, HttpServletRequest request) {
		// TODO Auto-generated method stub
		try {
			InputStream is = picture.getInputStream();
			String realPath = request.getServletContext().getRealPath("/files/");
			File f = new File(realPath, picture.getOriginalFilename());
			//File f = new File(realPath, picture. getName());
			FileOutputStream os = new FileOutputStream(f);
			byte [] b = new byte[1024*1024*10];
			int len = 0 ;
			while((len = is.read(b, 0, b.length)) != -1 ) {
				os.write(b, 0, len);
			}
			os.close();
			is.close();
			return "/files/"+picture.getOriginalFilename();
			} catch (IOException e) {
			e.printStackTrace( );
			}
		return null;
	}

}
