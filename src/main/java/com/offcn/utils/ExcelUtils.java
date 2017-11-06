package com.offcn.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.annotation.Resource;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.stereotype.Repository;

import com.offcn.Service.MobilenumService;
import com.offcn.po.Mobilenum;
@Repository
public class ExcelUtils {
	
	@Resource
	MobilenumService mobilenumService;

	public void getExcelToSqlbase(){
		FileInputStream in=null;
		Workbook workbook=null;
		try {
			in = new FileInputStream("D:\\chart\\Mobile.xls");
			workbook = WorkbookFactory.create(in);
			int sheetnum = workbook.getNumberOfSheets();
			for(int i=0;i<sheetnum;i++){
				Sheet sheet = workbook.getSheetAt(i);
				int rownum = sheet.getPhysicalNumberOfRows();
				for(int j=1;j<rownum;j++){
					Mobilenum mobilenum = new Mobilenum();
					Row row = sheet.getRow(j);
					int cellnum = row.getPhysicalNumberOfCells();
					for(int k=0;k<cellnum;k++){
						Cell cell = row.getCell(k);
						if(k==0){	
							mobilenum.setId((int)cell.getNumericCellValue());
						}else if(k==1){
							mobilenum.setMobilenumber(cell.getStringCellValue());
						}else if(k==2){
							mobilenum.setMobliearea(cell.getStringCellValue());
						}else if(k==3){
							mobilenum.setMobiletype(cell.getStringCellValue());
						}else if(k==4){
							mobilenum.setAreacode(cell.getStringCellValue());
						}else{
							mobilenum.setPostcode(cell.getStringCellValue());
						}
					}
					mobilenumService.insert(mobilenum);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
