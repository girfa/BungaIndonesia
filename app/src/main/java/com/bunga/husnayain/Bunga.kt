package com.bunga.husnayain

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Bunga (
    var nama: String = "",
    var latin: String = "",
    var keterangan: String = "",
    var url: String = "",
    var gambar: Int
) : Parcelable