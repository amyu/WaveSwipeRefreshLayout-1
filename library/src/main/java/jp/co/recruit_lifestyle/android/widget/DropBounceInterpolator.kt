/*
 * Copyright (C) 2015 RECRUIT LIFESTYLE CO., LTD.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package jp.co.recruit_lifestyle.android.widget

import android.view.animation.Interpolator


/**
 * @author amyu
 */
class DropBounceInterpolator : Interpolator {
    override fun getInterpolation(input: Float): Float =
            if (input < 0.25f) {
                -38.4f * Math.pow(input - 0.125, 2.0).toFloat() + 0.6f
            } else if (input >= 0.5 && input < 0.75) {
                -19.2f * Math.pow(input - 0.625, 2.0).toFloat() + 0.3f
            } else {
                0f
            }
}