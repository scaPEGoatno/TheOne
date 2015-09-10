package com.yumikoazu.theone.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by joker on 2015/9/2.
 */
public class ArticlePager implements Parcelable {


    private String result;
    private ContentEntityEntity contentEntity;

    public void setResult(String result) {
        this.result = result;
    }

    public void setContentEntity(ContentEntityEntity contentEntity) {
        this.contentEntity = contentEntity;
    }

    public String getResult() {
        return result;
    }

    public ContentEntityEntity getContentEntity() {
        return contentEntity;
    }

    public static class ContentEntityEntity implements Parcelable {

        private String strContAuthor;
        private String sGW;
        private String strContMarketTime;
        private String wImgUrl;
        private String strContTitle;
        private String strLastUpdateDate;
        private String strPraiseNumber;
        private String strContent;
        private String subTitle;
        private String sRdNum;
        private String strContAuthorIntroduce;
        private String sAuth;
        private String sWebLk;

        @Override
        public String toString() {
            return "ContentEntityEntity{" +
                    "strContAuthor='" + strContAuthor + '\'' +
                    ", sGW='" + sGW + '\'' +
                    ", strContMarketTime='" + strContMarketTime + '\'' +
                    ", wImgUrl='" + wImgUrl + '\'' +
                    ", strContTitle='" + strContTitle + '\'' +
                    ", strLastUpdateDate='" + strLastUpdateDate + '\'' +
                    ", strPraiseNumber='" + strPraiseNumber + '\'' +
                    ", strContent='" + strContent + '\'' +
                    ", subTitle='" + subTitle + '\'' +
                    ", sRdNum='" + sRdNum + '\'' +
                    ", strContAuthorIntroduce='" + strContAuthorIntroduce + '\'' +
                    ", sAuth='" + sAuth + '\'' +
                    ", sWebLk='" + sWebLk + '\'' +
                    ", strContentId='" + strContentId + '\'' +
                    ", sWbN='" + sWbN + '\'' +
                    ", strContDayDiffer='" + strContDayDiffer + '\'' +
                    '}';
        }

        private String strContentId;
        private String sWbN;
        private String strContDayDiffer;

        public void setStrContAuthor(String strContAuthor) {
            this.strContAuthor = strContAuthor;
        }

        public void setSGW(String sGW) {
            this.sGW = sGW;
        }

        public void setStrContMarketTime(String strContMarketTime) {
            this.strContMarketTime = strContMarketTime;
        }

        public void setWImgUrl(String wImgUrl) {
            this.wImgUrl = wImgUrl;
        }

        public void setStrContTitle(String strContTitle) {
            this.strContTitle = strContTitle;
        }

        public void setStrLastUpdateDate(String strLastUpdateDate) {
            this.strLastUpdateDate = strLastUpdateDate;
        }

        public void setStrPraiseNumber(String strPraiseNumber) {
            this.strPraiseNumber = strPraiseNumber;
        }

        public void setStrContent(String strContent) {
            this.strContent = strContent;
        }

        public void setSubTitle(String subTitle) {
            this.subTitle = subTitle;
        }

        public void setSRdNum(String sRdNum) {
            this.sRdNum = sRdNum;
        }

        public void setStrContAuthorIntroduce(String strContAuthorIntroduce) {
            this.strContAuthorIntroduce = strContAuthorIntroduce;
        }

        public void setSAuth(String sAuth) {
            this.sAuth = sAuth;
        }

        public void setSWebLk(String sWebLk) {
            this.sWebLk = sWebLk;
        }

        public void setStrContentId(String strContentId) {
            this.strContentId = strContentId;
        }

        public void setSWbN(String sWbN) {
            this.sWbN = sWbN;
        }

        public void setStrContDayDiffer(String strContDayDiffer) {
            this.strContDayDiffer = strContDayDiffer;
        }

        public String getStrContAuthor() {
            return strContAuthor;
        }

        public String getSGW() {
            return sGW;
        }

        public String getStrContMarketTime() {
            return strContMarketTime;
        }

        public String getWImgUrl() {
            return wImgUrl;
        }

        public String getStrContTitle() {
            return strContTitle;
        }

        public String getStrLastUpdateDate() {
            return strLastUpdateDate;
        }

        public String getStrPraiseNumber() {
            return strPraiseNumber;
        }

        public String getStrContent() {
            return strContent;
        }

        public String getSubTitle() {
            return subTitle;
        }

        public String getSRdNum() {
            return sRdNum;
        }

        public String getStrContAuthorIntroduce() {
            return strContAuthorIntroduce;
        }

        public String getSAuth() {
            return sAuth;
        }

        public String getSWebLk() {
            return sWebLk;
        }

        public String getStrContentId() {
            return strContentId;
        }

        public String getSWbN() {
            return sWbN;
        }

        public String getStrContDayDiffer() {
            return strContDayDiffer;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.sGW);
            dest.writeString(this.strContAuthor);
            dest.writeString(this.strContMarketTime);
            dest.writeString(this.wImgUrl);
            dest.writeString(this.strContTitle);
            dest.writeString(this.strLastUpdateDate);
            dest.writeString(this.strPraiseNumber);
            dest.writeString(this.strContent);
            dest.writeString(this.subTitle);
            dest.writeString(this.sRdNum);
            dest.writeString(this.strContAuthorIntroduce);
            dest.writeString(this.sAuth);
            dest.writeString(this.sWebLk);
            dest.writeString(this.strContentId);
            dest.writeString(this.sWbN);
            dest.writeString(this.strContDayDiffer);
        }

        public ContentEntityEntity() {
        }

        protected ContentEntityEntity(Parcel in) {
            this.sGW = in.readString();
            this.strContAuthor = in.readString();
            this.strContMarketTime = in.readString();
            this.wImgUrl = in.readString();
            this.strContTitle = in.readString();
            this.strLastUpdateDate = in.readString();
            this.strPraiseNumber = in.readString();
            this.strContent = in.readString();
            this.subTitle = in.readString();
            this.sRdNum = in.readString();
            this.strContAuthorIntroduce = in.readString();
            this.sAuth = in.readString();
            this.sWebLk = in.readString();
            this.strContentId = in.readString();
            this.sWbN = in.readString();
            this.strContDayDiffer = in.readString();
        }

        public static final Creator<ContentEntityEntity> CREATOR = new Creator<ContentEntityEntity>() {
            public ContentEntityEntity createFromParcel(Parcel source) {
                return new ContentEntityEntity(source);
            }

            public ContentEntityEntity[] newArray(int size) {
                return new ContentEntityEntity[size];
            }
        };
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.result);
        dest.writeParcelable(this.contentEntity, flags);
    }

    public ArticlePager() {
    }

    @Override
    public String toString() {
        return "ArticlePager{" +
                "result='" + result + '\'' +
                ", contentEntity=" + contentEntity.toString() +
                '}';
    }

    protected ArticlePager(Parcel in) {
        this.result = in.readString();
        this.contentEntity = in.readParcelable(ContentEntityEntity.class.getClassLoader());
    }

    public static final Parcelable.Creator<ArticlePager> CREATOR = new Parcelable.Creator<ArticlePager>() {
        public ArticlePager createFromParcel(Parcel source) {
            return new ArticlePager(source);
        }

        public ArticlePager[] newArray(int size) {
            return new ArticlePager[size];
        }
    };
}
