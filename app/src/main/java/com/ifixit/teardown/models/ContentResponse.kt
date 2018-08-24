package com.ifixit.teardown.models

import com.google.gson.annotations.SerializedName

data class ContentResponse(
        @field:SerializedName("Apparel")
        var apparel: Apparel? = null,
        @field:SerializedName("Appliance")
        var appliance: Appliance? = null,
        @field:SerializedName("Camera")
        var camera: Camera? = null,
        @field:SerializedName("Car and Truck")
        var carTruck: CarTruck? = null)