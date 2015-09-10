package com.yumikoazu.theone.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by joker on 2015/8/31.
 */
public class HomePager implements Parcelable {


    /**
     * result : SUCCESS
     * hpEntity : {"strThumbnailUrl":"http://pic.yupoo.com/hanapp/ETj2V0Ps/1pdas.jpg","sWebLk":"http://m.wufazhuce.com/one/2015-08-28","strOriginalImgUrl":"http://pic.yupoo.com/hanapp/ETj2V0Ps/1pdas.jpg","strDayDiffer":"","strHpTitle":"VOL.1055","wImgUrl":"http://211.152.49.184:9000/upload/onephoto/f1440060851215.jpg","strPn":"41104","strMarketTime":"2015-08-28","strHpId":"1075","strLastUpdateDate":"2015-08-20 16:54:11","strContent":"我在快乐这两个字都不知道怎么写的年纪最快乐。 by 夏正正","strAuthor":"孩子们&张翼 作品"}
     */
    private String result;
    private HpEntityEntity hpEntity;

    public void setResult(String result) {
        this.result = result;
    }

    public void setHpEntity(HpEntityEntity hpEntity) {
        this.hpEntity = hpEntity;
    }

    public String getResult() {
        return result;
    }

    public HpEntityEntity getHpEntity() {
        return hpEntity;
    }

    public static class HpEntityEntity implements Parcelable {
         /**
         * strThumbnailUrl : http://pic.yupoo.com/hanapp/ETj2V0Ps/1pdas.jpg
         * sWebLk : http://m.wufazhuce.com/one/2015-08-28
         * strOriginalImgUrl : http://pic.yupoo.com/hanapp/ETj2V0Ps/1pdas.jpg
         * strDayDiffer :
         * strHpTitle : VOL.1055
         * wImgUrl : http://211.152.49.184:9000/upload/onephoto/f1440060851215.jpg
         * strPn : 41104
         * strMarketTime : 2015-08-28
         * strHpId : 1075
         * strLastUpdateDate : 2015-08-20 16:54:11
         * strContent : 我在快乐这两个字都不知道怎么写的年纪最快乐。 by 夏正正
         * strAuthor : 孩子们&张翼 作品
         */
        private String strThumbnailUrl;
        private String sWebLk;
        private String strOriginalImgUrl;
        private String strDayDiffer;
        private String strHpTitle;
        private String wImgUrl;
        private String strPn;
        private String strMarketTime;
        private String strHpId;
        private String strLastUpdateDate;
        private String strContent;
        private String strAuthor;

        public void setStrThumbnailUrl(String strThumbnailUrl) {
            this.strThumbnailUrl = strThumbnailUrl;
        }

        public void setSWebLk(String sWebLk) {
            this.sWebLk = sWebLk;
        }

        public void setStrOriginalImgUrl(String strOriginalImgUrl) {
            this.strOriginalImgUrl = strOriginalImgUrl;
        }

        public void setStrDayDiffer(String strDayDiffer) {
            this.strDayDiffer = strDayDiffer;
        }

        public void setStrHpTitle(String strHpTitle) {
            this.strHpTitle = strHpTitle;
        }

        public void setWImgUrl(String wImgUrl) {
            this.wImgUrl = wImgUrl;
        }

        public void setStrPn(String strPn) {
            this.strPn = strPn;
        }

        public void setStrMarketTime(String strMarketTime) {
            this.strMarketTime = strMarketTime;
        }

        public void setStrHpId(String strHpId) {
            this.strHpId = strHpId;
        }

        public void setStrLastUpdateDate(String strLastUpdateDate) {
            this.strLastUpdateDate = strLastUpdateDate;
        }

        public void setStrContent(String strContent) {
            this.strContent = strContent;
        }

        public void setStrAuthor(String strAuthor) {
            this.strAuthor = strAuthor;
        }

        public String getStrThumbnailUrl() {
            return strThumbnailUrl;
        }

        public String getSWebLk() {
            return sWebLk;
        }

        public String getStrOriginalImgUrl() {
            return strOriginalImgUrl;
        }

        public String getStrDayDiffer() {
            return strDayDiffer;
        }

        public String getStrHpTitle() {
            return strHpTitle;
        }

        public String getWImgUrl() {
            return wImgUrl;
        }

        public String getStrPn() {
            return strPn;
        }

        public String getStrMarketTime() {
            return strMarketTime;
        }

        public String getStrHpId() {
            return strHpId;
        }

        public String getStrLastUpdateDate() {
            return strLastUpdateDate;
        }

        public String getStrContent() {
            return strContent;
        }

        public String getStrAuthor() {
            return strAuthor;
        }

        @Override
        public String toString() {
            return "HpEntityEntity{" +
                    "strThumbnailUrl='" + strThumbnailUrl + '\'' +
                    ", sWebLk='" + sWebLk + '\'' +
                    ", strOriginalImgUrl='" + strOriginalImgUrl + '\'' +
                    ", strDayDiffer='" + strDayDiffer + '\'' +
                    ", strHpTitle='" + strHpTitle + '\'' +
                    ", wImgUrl='" + wImgUrl + '\'' +
                    ", strPn='" + strPn + '\'' +
                    ", strMarketTime='" + strMarketTime + '\'' +
                    ", strHpId='" + strHpId + '\'' +
                    ", strLastUpdateDate='" + strLastUpdateDate + '\'' +
                    ", strContent='" + strContent + '\'' +
                    ", strAuthor='" + strAuthor + '\'' +
                    '}';
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.strThumbnailUrl);
            dest.writeString(this.sWebLk);
            dest.writeString(this.strOriginalImgUrl);
            dest.writeString(this.strDayDiffer);
            dest.writeString(this.strHpTitle);
            dest.writeString(this.wImgUrl);
            dest.writeString(this.strPn);
            dest.writeString(this.strMarketTime);
            dest.writeString(this.strHpId);
            dest.writeString(this.strLastUpdateDate);
            dest.writeString(this.strContent);
            dest.writeString(this.strAuthor);
        }

        public HpEntityEntity() {
        }

        protected HpEntityEntity(Parcel in) {
            this.strThumbnailUrl = in.readString();
            this.sWebLk = in.readString();
            this.strOriginalImgUrl = in.readString();
            this.strDayDiffer = in.readString();
            this.strHpTitle = in.readString();
            this.wImgUrl = in.readString();
            this.strPn = in.readString();
            this.strMarketTime = in.readString();
            this.strHpId = in.readString();
            this.strLastUpdateDate = in.readString();
            this.strContent = in.readString();
            this.strAuthor = in.readString();
        }

        public static final Parcelable.Creator<HpEntityEntity> CREATOR = new Parcelable.Creator<HpEntityEntity>() {
            public HpEntityEntity createFromParcel(Parcel source) {
                return new HpEntityEntity(source);
            }

            public HpEntityEntity[] newArray(int size) {
                return new HpEntityEntity[size];
            }
        };
    }

    @Override
    public String toString() {
        return "HomePager{" +
                "result='" + result + '\'' +
                ", hpEntity=" + hpEntity.toString() +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.result);
        dest.writeParcelable(this.hpEntity, 0);
    }

    public HomePager() {
    }

    protected HomePager(Parcel in) {
        this.result = in.readString();
        this.hpEntity = in.readParcelable(HpEntityEntity.class.getClassLoader());
    }

    public static final Parcelable.Creator<HomePager> CREATOR = new Parcelable.Creator<HomePager>() {
        public HomePager createFromParcel(Parcel source) {
            return new HomePager(source);
        }

        public HomePager[] newArray(int size) {
            return new HomePager[size];
        }
    };
}
