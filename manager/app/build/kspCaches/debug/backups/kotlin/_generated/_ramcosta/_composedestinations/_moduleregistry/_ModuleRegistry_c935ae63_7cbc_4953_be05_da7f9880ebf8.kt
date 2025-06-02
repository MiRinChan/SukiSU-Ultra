package _generated._ramcosta._composedestinations._moduleregistry

import com.ramcosta.composedestinations.spec.DestinationSpec

public annotation class _Info_c935ae63_7cbc_4953_be05_da7f9880ebf8(
    val moduleName: String,
    val packageName: String,
    val hasNavArgsPackage: Boolean,
    val typeResults: Array<_Destination_Result_Info_c935ae63_7cbc_4953_be05_da7f9880ebf8> = emptyArray(),
    val topLevelGraphs: Array<String> = emptyArray()
)

public annotation class _Destination_Result_Info_c935ae63_7cbc_4953_be05_da7f9880ebf8(
    val destination: String,
    val resultType: String,
    val resultNavType: String,
    val isResultNullable: Boolean
)

@_Info_c935ae63_7cbc_4953_be05_da7f9880ebf8(
    moduleName = "",
    packageName = "com.ramcosta.composedestinations.generated",
    hasNavArgsPackage = true,
    typeResults = [
       _Destination_Result_Info_c935ae63_7cbc_4953_be05_da7f9880ebf8(
           destination = "com.ramcosta.composedestinations.generated.destinations.TemplateEditorScreenDestination",
           resultType = "kotlin.Boolean",
           resultNavType = "com.ramcosta.composedestinations.navargs.primitives.booleanNavType",
           isResultNullable = false
       )
    ],
    topLevelGraphs = [
		"RootNavGraph"
    ]
)
public object _ModuleRegistry_c935ae63_7cbc_4953_be05_da7f9880ebf8