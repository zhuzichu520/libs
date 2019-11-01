@file:JvmName("ToolCommon")

package com.zhuzichu.android.libs.tool


/**
 * 类型强转
 *
 */
fun <T> cast(obj: Any?): T? {
    return if (obj == null) null else obj as T
}

/**
 * 类型强转
 *
 */
fun <T> Any?.toCast(): T? {
    return if (this == null) null else this as T
}