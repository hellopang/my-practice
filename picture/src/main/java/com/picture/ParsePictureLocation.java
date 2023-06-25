package com.picture;

import com.drew.imaging.ImageMetadataReader;
import com.drew.lang.GeoLocation;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.drew.metadata.Tag;
import com.drew.metadata.exif.GpsDirectory;

import java.io.File;
import java.util.Iterator;
import java.util.Objects;

/**
 * 解析图片地理信息
 *
 * @author psh 2023/6/25 7:29
 */
public class ParsePictureLocation {

	/**
	 * 图片必须包含gps信息, 否则读取不到， 不过目前的手机很可能会处理这些隐私信息，一般读取不到
	 */
	public static void main(String[] args) {
		String picturePath = "D:\\MyPrivate\\图片\\微信图片_20210223102617.JPG";

		readPic(picturePath);
	}

	public static void readPic2(String picturePath) {

		File jpegFile = new File(picturePath);
		Metadata metadata = null;
		try {
			metadata = ImageMetadataReader.readMetadata(jpegFile);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		GpsDirectory gpsDirectory = metadata.getFirstDirectoryOfType(GpsDirectory.class);
		if (Objects.nonNull(gpsDirectory)) {
			GeoLocation geoLocation = gpsDirectory.getGeoLocation();
			System.out.println(geoLocation.getLongitude());
			System.out.println(geoLocation.getLatitude());
		}

	}

	public static void readPic(String picturePath) {
		System.out.println("开始读取图片信息...");
		File jpegFile = new File(picturePath);
		Metadata metadata;
		try {
			metadata = ImageMetadataReader.readMetadata(jpegFile);
			Iterator<Directory> it = metadata.getDirectories().iterator();
			while (it.hasNext()) {
				Directory exif = it.next();
				Iterator<Tag> tags = exif.getTags().iterator();
				while (tags.hasNext()) {
					Tag tag = (Tag) tags.next();
					System.out.println(tag);
				}
			}
			System.out.println("图片信息读取完成！");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
