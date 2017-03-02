package com.jd.dp.composite;

public class Client {

	public static void main(String[] args) {
		
		
		//总文件夹
        Folder zwjj = new Folder("总文件夹");
        TextFile aText= new TextFile("a.txt");
        ImageFile bImager = new ImageFile("b.jpg");
        Folder cFolder = new Folder("C文件夹");
        
        zwjj.add(aText);
        zwjj.add(bImager);
        zwjj.add(cFolder);
        
        TextFile cText = new TextFile("c_1.txt");
        ImageFile cImage = new ImageFile("c_1.jpg");
        VideoFile cVideo = new VideoFile("c_1.rmvb");
        
        cFolder.add(cText);
        cFolder.add(cImage);
        cFolder.add(cVideo);
        
        //遍历C文件夹
        cFolder.display();
        //将c_1.txt删除
        cFolder.remove(cText);
        System.out.println("-----------------------");
        cFolder.display();
        
        System.out.println("-----------------------");
        zwjj.display();

	}

}
