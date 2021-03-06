package edu.arizona.biosemantics.otolite.client.rpc;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import edu.arizona.biosemantics.otolite.shared.beans.UploadInfo;

@RemoteServiceRelativePath("general")
public interface GeneralServiceAsync {

	void getUploadInfo(String uploadID, String secret, AsyncCallback<UploadInfo> callback);

}
