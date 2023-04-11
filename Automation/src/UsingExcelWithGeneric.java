import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import com.actitime.generic.FileLib;

public class UsingExcelWithGeneric {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//reading from property file 
		String username=FileLib.getPropertyData("username");
		System.out.println("printing username from property file "+username);
		
		//reading from excel 
		
		//getting url
		
		String url=FileLib.readExcelData("CreateCustomer", 1, 2);
		System.out.println("url is "+url);

	}

}
