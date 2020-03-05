package nickolaill.runeak.showcase;

import android.os.Parcel;
import android.os.Parcelable;

public class Animal implements Parcelable {
    private String name;
    private String description;
    private String bonusInfo;

    public String getBonusInfo() {
        return bonusInfo;
    }

    public void setBonusInfo(String bonusInfo) {
        this.bonusInfo = bonusInfo;
    }

    public Animal(String name, String description, String bonusInfo) {
        this.name = name;
        this.description = description;
        this.bonusInfo = bonusInfo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.description);
        dest.writeString(this.bonusInfo);
    }

    protected Animal(Parcel in) {
        this.name = in.readString();
        this.description = in.readString();
        this.bonusInfo = in.readString();
    }

    public static final Parcelable.Creator<Animal> CREATOR = new Parcelable.Creator<Animal>() {
        @Override
        public Animal createFromParcel(Parcel source) {
            return new Animal(source);
        }

        @Override
        public Animal[] newArray(int size) {
            return new Animal[size];
        }
    };
}
