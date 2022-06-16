package br.com.zup.caixasupermercado.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Product(
    private var name: String,
    private var qty: Int,
    private var unitaryValue: Double
) : Parcelable {
    fun getName() = this.name
    fun getQty() = this.qty.toString()
    fun getUnitaryValue() = this.unitaryValue.toString()
    }

private fun validation(name: String, qty: String, unitaryValue: String) {
    require(name.isNotBlank()) { "O nome deve ser preenchido." }
    require(qty.isNotBlank()) { "A quantidade deve ser preenchida." }
    require(unitaryValue.isNotBlank()) { "O valor unitário deve ser preenchido." }
}

