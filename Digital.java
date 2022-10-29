package ContactsClass;
/*****
  * UML 
  * Digital extends Contact
  -------------------
  * - twitterHandle : String
  * - igHandle : String
  * - tiktokHandle : String
  -------------------
  * + Digital(String, String, String, String, int, String, String, String)
  * + Physical(String, String, String)
  * + getTwitterHandle() : String
  * + setTwitterHandle(String) : void
  * + getIgHandle() : String
  * + setIgHandle(String) : void
  * + getTiktokHandle() : String
  * + setTiktokHandle(String) : void
  * + toString() : String
  *****/


public class Digital extends Contact {
  String twitterHandle;
  String igHandle;
  String tiktokHandle;

  public Digital(String lastName, String firstName, String email, String phone, int stars, String twitterHandle, String igHandle, String tiktokHandle) {
    super(lastName, firstName, email, phone, stars);
    this.twitterHandle = twitterHandle;
    this.igHandle = igHandle;
    this.tiktokHandle = tiktokHandle;
  }

  public Digital(String twitterHandle, String igHandle, String tiktokHandle) {
    this.twitterHandle = twitterHandle;
    this.igHandle = igHandle;
    this.tiktokHandle = tiktokHandle;
  }

  public String getTwitterHandle() {
    return twitterHandle;
  }

  public void setTwitterHandle(String s) {
    this.twitterHandle = s;
  }

  public String getIgHandle() {
    return igHandle;
  }

  public void setIgHandle(String s) {
    this.igHandle = s;
  }

  public String getTiktokHandle() {
    return tiktokHandle;
  }

  public void setTiktokHandle(String s) {
    this.tiktokHandle = s;
  }

  public String toString() {
    return super.toString() + "\nTwitter: @" + twitterHandle + "\nInstagram: @" + igHandle + "\nTikTok: @" + tiktokHandle;
  }
    
}
