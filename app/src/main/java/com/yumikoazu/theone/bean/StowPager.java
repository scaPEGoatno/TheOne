package com.yumikoazu.theone.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by joker on 2015/9/2.
 */
public class StowPager implements Parcelable {


    /**
     * rs : SUCCESS
     * entTg : {"strWu":"http://m.wufazhuce.com/thing/2015-08-28","strBu":"http://pic.yupoo.com/hanapp/ETh4vVKW/rFG4I.jpg","strTm":"2015-08-28","strId":"592","strPn":"0","strTc":"没有数字，没有指针，没有滴答声。 时间随风飘动，静而美。","strTt":"睫毛时钟","strLastUpdateDate":"2015-08-20 11:48:13"}
     */
    private String rs;
    private EntTgEntity entTg;

    public void setRs(String rs) {
        this.rs = rs;
    }

    public void setEntTg(EntTgEntity entTg) {
        this.entTg = entTg;
    }

    public String getRs() {
        return rs;
    }

    public EntTgEntity getEntTg() {
        return entTg;
    }

    public static class EntTgEntity implements Parcelable {
        /**
         * strWu : http://m.wufazhuce.com/thing/2015-08-28
         * strBu : http://pic.yupoo.com/hanapp/ETh4vVKW/rFG4I.jpg
         * strTm : 2015-08-28
         * strId : 592
         * strPn : 0
         * strTc : 没有数字，没有指针，没有滴答声。 时间随风飘动，静而美。
         * strTt : 睫毛时钟
         * strLastUpdateDate : 2015-08-20 11:48:13
         */
        private String strWu;
        private String strBu;
        private String strTm;
        private String strId;
        private String strPn;
        private String strTc;
        private String strTt;
        private String strLastUpdateDate;

        public void setStrWu(String strWu) {
            this.strWu = strWu;
        }

        public void setStrBu(String strBu) {
            this.strBu = strBu;
        }

        public void setStrTm(String strTm) {
            this.strTm = strTm;
        }

        public void setStrId(String strId) {
            this.strId = strId;
        }

        public void setStrPn(String strPn) {
            this.strPn = strPn;
        }

        public void setStrTc(String strTc) {
            this.strTc = strTc;
        }

        public void setStrTt(String strTt) {
            this.strTt = strTt;
        }

        public void setStrLastUpdateDate(String strLastUpdateDate) {
            this.strLastUpdateDate = strLastUpdateDate;
        }

        public String getStrWu() {
            return strWu;
        }

        public String getStrBu() {
            return strBu;
        }

        public String getStrTm() {
            return strTm;
        }

        public String getStrId() {
            return strId;
        }

        public String getStrPn() {
            return strPn;
        }

        public String getStrTc() {
            return strTc;
        }

        public String getStrTt() {
            return strTt;
        }

        public String getStrLastUpdateDate() {
            return strLastUpdateDate;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.strWu);
            dest.writeString(this.strBu);
            dest.writeString(this.strTm);
            dest.writeString(this.strId);
            dest.writeString(this.strPn);
            dest.writeString(this.strTc);
            dest.writeString(this.strTt);
            dest.writeString(this.strLastUpdateDate);
        }

        public EntTgEntity() {
        }

        protected EntTgEntity(Parcel in) {
            this.strWu = in.readString();
            this.strBu = in.readString();
            this.strTm = in.readString();
            this.strId = in.readString();
            this.strPn = in.readString();
            this.strTc = in.readString();
            this.strTt = in.readString();
            this.strLastUpdateDate = in.readString();
        }

        public static final Parcelable.Creator<EntTgEntity> CREATOR = new Parcelable.Creator<EntTgEntity>() {
            public EntTgEntity createFromParcel(Parcel source) {
                return new EntTgEntity(source);
            }

            public EntTgEntity[] newArray(int size) {
                return new EntTgEntity[size];
            }
        };
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.rs);
        dest.writeParcelable(this.entTg, 0);
    }

    public StowPager() {
    }

    protected StowPager(Parcel in) {
        this.rs = in.readString();
        this.entTg = in.readParcelable(EntTgEntity.class.getClassLoader());
    }

    public static final Parcelable.Creator<StowPager> CREATOR = new Parcelable.Creator<StowPager>() {
        public StowPager createFromParcel(Parcel source) {
            return new StowPager(source);
        }

        public StowPager[] newArray(int size) {
            return new StowPager[size];
        }
    };
}

