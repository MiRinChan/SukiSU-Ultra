package _generated._ramcosta._composedestinations._moduleregistry

import com.ramcosta.composedestinations.spec.DestinationSpec

public annotation class _Info_5b3f10f5_0f57_4f14_b10f_856b04984264(
    val moduleName: String,
    val packageName: String,
    val hasNavArgsPackage: Boolean,
    val typeResults: Array<_Destination_Result_Info_5b3f10f5_0f57_4f14_b10f_856b04984264> = emptyArray(),
    val topLevelGraphs: Array<String> = emptyArray()
)

public annotation class _Destination_Result_Info_5b3f10f5_0f57_4f14_b10f_856b04984264(
    val destination: String,
    val resultType: String,
    val resultNavType: String,
    val isResultNullable: Boolean
)

@_Info_5b3f10f5_0f57_4f14_b10f_856b04984264(
    moduleName = "",
    packageName = "com.ramcosta.composedestinations.generated",
    hasNavArgsPackage = true,
    typeResults = [
       _Destination_Result_Info_5b3f10f5_0f57_4f14_b10f_856b04984264(
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
public object _ModuleRegistry_5b3f10f5_0f57_4f14_b10f_856b04984264