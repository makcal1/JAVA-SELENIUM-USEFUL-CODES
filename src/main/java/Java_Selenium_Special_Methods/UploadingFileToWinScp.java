package Java_Selenium_Special_Methods;

import com.itextpdf.text.pdf.parser.Vector;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;

public class UploadingFileToWinScp {

	public static void main(String[] args) throws JSchException, SftpException {


		JSch jSch = new JSch();
		Session session= jSch.getSession("","");
		session.connect();
		System.out.println("Session connected: " +session.isConnected());
		ChannelSftp channelSftp = (ChannelSftp) session.openChannel("sftb");
		try {
			channelSftp.connect();
			java.util.Vector fileList = channelSftp.ls("destinationPath");
			for (int i = 0; i < fileList.size(); i++) {
				ChannelSftp.LsEntry lsEntry = (ChannelSftp.LsEntry) fileList.get(i);
				String files = lsEntry.getFilename();
				System.out.println(files);
				if(files.contains("source file Name")) {
					System.out.println("The file is already avaiable in the destination path");
				}else {
					channelSftp.put("src", "dst");
					System.out.println("Source file added into the path");
				}}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			channelSftp.disconnect();
			session.disconnect();

		}
	}}





