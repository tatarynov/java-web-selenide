package support;

import static com.codeborne.selenide.Selenide.switchTo;

/***
 * This is tool for interacting with IFrame
 * Just create an instance and switch beetwen frames by id or by position
 */
public class IFrameTools {

	boolean isFrameOn;
	int framePosition;
	private static IFrameTools instance;

	private IFrameTools() {
	}

	public void switchToFrame(String nameOrId) {
		switchToDefaultContent();
		switchTo().frame(nameOrId);
		setFrameOn(true);
	}

	public void switchToFrame(int position) {
		switchToDefaultContent();
		switchTo().frame(position);
		setFramePosition(position);
		setFrameOn(true);
	}

	public void switchToDefaultContent() {
		switchTo().defaultContent();
		setFrameOn(false);
	}

	public static IFrameTools getInstance() {
		if (instance == null) instance = new IFrameTools();
		return instance;
	}

	public boolean isFrame() {
		return isFrameOn;
	}

	public void setFrameOn(boolean frameSwitchedTo) {
		isFrameOn = frameSwitchedTo;
	}

	public void setFramePosition(int framePosition) {
		this.framePosition = framePosition;
	}

	public int getFramePosition() {
		return framePosition;
	}
}
