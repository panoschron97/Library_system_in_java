import java.util.ArrayList;

public class Librarybook extends Library {

	public Librarybook(String titleofbook,ArrayList <String > Authors,String isbnofbook,int yearofbook,String descriptionofbook,String typeofbook,int numberofpagesfromthebook,String positionofbook) {
		
		//����� ��� ������������ �� �������� ��� ���� ������� ��� ����������� ��� ��� ����� library.
		
		this.titleofbook=titleofbook;
		this.Authors=Authors;
		this.isbnofbook=isbnofbook;
		this.yearofbook=yearofbook;
		this.descriptionofbook=descriptionofbook;
		this.typeofbook=typeofbook;
		this.numberofpagesfromthebook=numberofpagesfromthebook;
		this.positionofbook=positionofbook;
		
	}
	
}
