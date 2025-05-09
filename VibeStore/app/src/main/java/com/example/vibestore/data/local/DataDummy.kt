package com.example.vibestore.data.local

import androidx.compose.ui.graphics.Color
import com.example.vibestore.R
import com.example.vibestore.data.local.entity.UserLocation
import com.example.vibestore.model.Coupon
import com.example.vibestore.model.PaymentMethod
import com.example.vibestore.model.Shipping

object DataDummy {
    val dummyUserLocation = listOf(
        UserLocation(
            id = 1,
            name = "Landmark 81",
            address = "720A Dien Bien Phu, 22 Ward, " +
                    "Binh Thanh District, Ho Chi Minh City, " +
                    "Viet Nam"
        ),
        UserLocation(
            id = 2,
            name = "Bitexco Tower",
            address = "720A Dien Bien Phu, 22 Ward, " +
                    "Binh Thanh District, Ho Chi Minh City, " +
                    "Viet Nam"
        ),
    )
    val dummyShipping = listOf(
        Shipping(
            name = "REG",
            price = 13.00,
            description = "Estimated time of arrival 2 - 3 days"
        ),
        Shipping(
            name = "OKE",
            price = 15.00,
            description = "Estimated time of arrival 1 - 2 days"
        ),
        Shipping(
            name = "YES",
            price = 10.00,
            description = "Estimated time of arrival 1 - 2 days"
        )
    )
    val dummyPaymentMethod = listOf(
        PaymentMethod(
            icon = R.drawable.icon_discover,
            name = "Discover"
        ),
        PaymentMethod(
            icon = R.drawable.icon_master_card,
            name = "Master Card"
        ),
        PaymentMethod(
            icon = R.drawable.icon_paypal,
            name = "Paypal"
        ),
        PaymentMethod(
            icon = R.drawable.icon_visa,
            name = "Visa"
        ),
    )
    val dummyCoupon = listOf(
        Coupon(
            discountedPrice = "FREE SHIPPING",
            description = "Applies to get free shipping",
            expiredDate = "10 May 2025",
            color1 = Color(0xFF9733EE),
            color2 = Color(0xFFDA22FF),
            couponCode = "FWHWFW45A"
        ),
        Coupon(
            discountedPrice = "25%",
            description = "Applies to get 25% off",
            expiredDate = "10 May 2025",
            color1 = Color(0xFFFFA726),
            color2 = Color(0xFFFFD54F),
            couponCode = "ADERTS4TA"
        ),
        Coupon(
            discountedPrice = "50%",
            couponCode = "NHJASE32Q",
            description = "Applies to get 50% off",
            expiredDate = "10 May 2025",
            color1 = Color(0xFF00C9FF),
            color2 = Color(0xFF92FE9D)
        )
    )
}