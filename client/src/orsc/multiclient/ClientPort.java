package orsc.multiclient;

import com.openrsc.client.model.Sprite;

import java.io.ByteArrayInputStream;

public interface ClientPort {

	static boolean saveCredentials() {
		return saveCredentials();
	}

	public static boolean saveCredentials(String creds) {
		return false;
	}

	public boolean drawLoading(int i);

	public void showLoadingProgress(int percentage, String status);

	public void initListeners();

	public void crashed();

	public void drawLoadingError();

	public void drawOutOfMemoryError();

	public boolean isDisplayable();

	public void drawTextBox(String line2, byte var2, String line1);

	public void initGraphics();

	public void draw();

	public void close();

	public String getCacheLocation();

	public void resized();

	public Sprite getSpriteFromByteArray(ByteArrayInputStream byteArrayInputStream);

	public void playSound(byte[] soundData, int offset, int dataLength);

	public void stopSoundPlayer();

	public void drawKeyboard();

	public String loadCredentials();
	
	public int loadHideIp();
}
