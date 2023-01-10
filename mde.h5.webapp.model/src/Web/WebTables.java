/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /mde.h5.webapp.model/WebApp.ecore
 * using:
 *   /mde.h5.webapp.model/MyApp.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package Web;

// import Web.WebPackage;
// import Web.WebTables;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.ocl.pivot.ParameterTypes;
import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.EnumerationId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.RootPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.TypeUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * WebTables provides the dispatch tables for the Web for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class WebTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(WebPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ RootPackageId PACKid_$metamodel$ = IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_https_c_s_s_homework5_s_webapp = IdManager.getNsURIPackageId("https://homework5/webapp", null, WebPackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Class = WebTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Column = WebTables.PACKid_https_c_s_s_homework5_s_webapp.getClassId("Column", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Content = WebTables.PACKid_https_c_s_s_homework5_s_webapp.getClassId("Content", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Index = WebTables.PACKid_https_c_s_s_homework5_s_webapp.getClassId("Index", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Individual = WebTables.PACKid_https_c_s_s_homework5_s_webapp.getClassId("Individual", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Link = WebTables.PACKid_https_c_s_s_homework5_s_webapp.getClassId("Link", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Page = WebTables.PACKid_https_c_s_s_homework5_s_webapp.getClassId("Page", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Table = WebTables.PACKid_https_c_s_s_homework5_s_webapp.getClassId("Table", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_WebApp = WebTables.PACKid_https_c_s_s_homework5_s_webapp.getClassId("WebApp", 0);
	public static final /*@NonInvalid*/ EnumerationId ENUMid_ColumnType = WebTables.PACKid_https_c_s_s_homework5_s_webapp.getEnumerationId("ColumnType");
	public static final /*@NonInvalid*/ EnumerationId ENUMid_ContentType = WebTables.PACKid_https_c_s_s_homework5_s_webapp.getEnumerationId("ContentType");
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ IntegerValue INT_1 = ValueUtil.integerValueOf("1");
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Index = TypeId.BAG.getSpecializedId(WebTables.CLSSid_Index, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Individual = TypeId.BAG.getSpecializedId(WebTables.CLSSid_Individual, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Link = TypeId.BAG.getSpecializedId(WebTables.CLSSid_Link, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Link_0 = TypeId.BAG.getSpecializedId(WebTables.CLSSid_Link, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_Table = TypeId.BAG.getSpecializedId(WebTables.CLSSid_Table, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Column = TypeId.ORDERED_SET.getSpecializedId(WebTables.CLSSid_Column, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Column_0 = TypeId.ORDERED_SET.getSpecializedId(WebTables.CLSSid_Column, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Content = TypeId.ORDERED_SET.getSpecializedId(WebTables.CLSSid_Content, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Index = TypeId.ORDERED_SET.getSpecializedId(WebTables.CLSSid_Index, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Link = TypeId.ORDERED_SET.getSpecializedId(WebTables.CLSSid_Link, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Page = TypeId.ORDERED_SET.getSpecializedId(WebTables.CLSSid_Page, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Table = TypeId.ORDERED_SET.getSpecializedId(WebTables.CLSSid_Table, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Column = TypeId.SET.getSpecializedId(WebTables.CLSSid_Column, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Index = TypeId.SET.getSpecializedId(WebTables.CLSSid_Index, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Index_0 = TypeId.SET.getSpecializedId(WebTables.CLSSid_Index, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Individual = TypeId.SET.getSpecializedId(WebTables.CLSSid_Individual, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Individual_0 = TypeId.SET.getSpecializedId(WebTables.CLSSid_Individual, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Link = TypeId.SET.getSpecializedId(WebTables.CLSSid_Link, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Link_0 = TypeId.SET.getSpecializedId(WebTables.CLSSid_Link, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId SET_CLSSid_Page = TypeId.SET.getSpecializedId(WebTables.CLSSid_Page, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			WebTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of WebTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Column = new EcoreExecutorType(WebPackage.Literals.COLUMN, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _ColumnType = new EcoreExecutorEnumeration(WebPackage.Literals.COLUMN_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Content = new EcoreExecutorType(WebPackage.Literals.CONTENT, PACKAGE, 0);
		public static final EcoreExecutorEnumeration _ContentType = new EcoreExecutorEnumeration(WebPackage.Literals.CONTENT_TYPE, PACKAGE, 0);
		public static final EcoreExecutorType _Index = new EcoreExecutorType(WebPackage.Literals.INDEX, PACKAGE, 0);
		public static final EcoreExecutorType _Individual = new EcoreExecutorType(WebPackage.Literals.INDIVIDUAL, PACKAGE, 0);
		public static final EcoreExecutorType _Link = new EcoreExecutorType(WebPackage.Literals.LINK, PACKAGE, 0);
		public static final EcoreExecutorType _NamedElement = new EcoreExecutorType(WebPackage.Literals.NAMED_ELEMENT, PACKAGE, 0);
		public static final EcoreExecutorType _Page = new EcoreExecutorType(WebPackage.Literals.PAGE, PACKAGE, 0);
		public static final EcoreExecutorType _Table = new EcoreExecutorType(WebPackage.Literals.TABLE, PACKAGE, 0);
		public static final EcoreExecutorType _WebApp = new EcoreExecutorType(WebPackage.Literals.WEB_APP, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Column,
			_ColumnType,
			_Content,
			_ContentType,
			_Index,
			_Individual,
			_Link,
			_NamedElement,
			_Page,
			_Table,
			_WebApp
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of WebTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Column__Column = new ExecutorFragment(Types._Column, WebTables.Types._Column);
		private static final ExecutorFragment _Column__NamedElement = new ExecutorFragment(Types._Column, WebTables.Types._NamedElement);
		private static final ExecutorFragment _Column__OclAny = new ExecutorFragment(Types._Column, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Column__OclElement = new ExecutorFragment(Types._Column, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ColumnType__ColumnType = new ExecutorFragment(Types._ColumnType, WebTables.Types._ColumnType);
		private static final ExecutorFragment _ColumnType__OclAny = new ExecutorFragment(Types._ColumnType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ColumnType__OclElement = new ExecutorFragment(Types._ColumnType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ColumnType__OclEnumeration = new ExecutorFragment(Types._ColumnType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _ColumnType__OclType = new ExecutorFragment(Types._ColumnType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _Content__Content = new ExecutorFragment(Types._Content, WebTables.Types._Content);
		private static final ExecutorFragment _Content__NamedElement = new ExecutorFragment(Types._Content, WebTables.Types._NamedElement);
		private static final ExecutorFragment _Content__OclAny = new ExecutorFragment(Types._Content, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Content__OclElement = new ExecutorFragment(Types._Content, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _ContentType__ContentType = new ExecutorFragment(Types._ContentType, WebTables.Types._ContentType);
		private static final ExecutorFragment _ContentType__OclAny = new ExecutorFragment(Types._ContentType, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _ContentType__OclElement = new ExecutorFragment(Types._ContentType, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _ContentType__OclEnumeration = new ExecutorFragment(Types._ContentType, OCLstdlibTables.Types._OclEnumeration);
		private static final ExecutorFragment _ContentType__OclType = new ExecutorFragment(Types._ContentType, OCLstdlibTables.Types._OclType);

		private static final ExecutorFragment _Index__Index = new ExecutorFragment(Types._Index, WebTables.Types._Index);
		private static final ExecutorFragment _Index__NamedElement = new ExecutorFragment(Types._Index, WebTables.Types._NamedElement);
		private static final ExecutorFragment _Index__OclAny = new ExecutorFragment(Types._Index, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Index__OclElement = new ExecutorFragment(Types._Index, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Individual__Individual = new ExecutorFragment(Types._Individual, WebTables.Types._Individual);
		private static final ExecutorFragment _Individual__NamedElement = new ExecutorFragment(Types._Individual, WebTables.Types._NamedElement);
		private static final ExecutorFragment _Individual__OclAny = new ExecutorFragment(Types._Individual, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Individual__OclElement = new ExecutorFragment(Types._Individual, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Link__Link = new ExecutorFragment(Types._Link, WebTables.Types._Link);
		private static final ExecutorFragment _Link__OclAny = new ExecutorFragment(Types._Link, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Link__OclElement = new ExecutorFragment(Types._Link, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _NamedElement__NamedElement = new ExecutorFragment(Types._NamedElement, WebTables.Types._NamedElement);
		private static final ExecutorFragment _NamedElement__OclAny = new ExecutorFragment(Types._NamedElement, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _NamedElement__OclElement = new ExecutorFragment(Types._NamedElement, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Page__NamedElement = new ExecutorFragment(Types._Page, WebTables.Types._NamedElement);
		private static final ExecutorFragment _Page__OclAny = new ExecutorFragment(Types._Page, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Page__OclElement = new ExecutorFragment(Types._Page, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Page__Page = new ExecutorFragment(Types._Page, WebTables.Types._Page);

		private static final ExecutorFragment _Table__NamedElement = new ExecutorFragment(Types._Table, WebTables.Types._NamedElement);
		private static final ExecutorFragment _Table__OclAny = new ExecutorFragment(Types._Table, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Table__OclElement = new ExecutorFragment(Types._Table, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Table__Table = new ExecutorFragment(Types._Table, WebTables.Types._Table);

		private static final ExecutorFragment _WebApp__NamedElement = new ExecutorFragment(Types._WebApp, WebTables.Types._NamedElement);
		private static final ExecutorFragment _WebApp__OclAny = new ExecutorFragment(Types._WebApp, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _WebApp__OclElement = new ExecutorFragment(Types._WebApp, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _WebApp__WebApp = new ExecutorFragment(Types._WebApp, WebTables.Types._WebApp);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of WebTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		public static final ParameterTypes _String = TypeUtil.createParameterTypes(OCLstdlibTables.Types._String);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of WebTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		public static final ExecutorOperation _Link__referencesNumber = new ExecutorOperation("referencesNumber", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Link,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final ExecutorOperation _WebApp__entityInstancesNumber = new ExecutorOperation("entityInstancesNumber", Parameters._String, Types._WebApp,
			0, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of WebTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Column__isPK = new EcoreExecutorProperty(WebPackage.Literals.COLUMN__IS_PK, Types._Column, 0);
		public static final ExecutorProperty _Column__type = new EcoreExecutorProperty(WebPackage.Literals.COLUMN__TYPE, Types._Column, 1);
		public static final ExecutorProperty _Column__Individual__attributes = new ExecutorPropertyWithImplementation("Individual", Types._Column, 2, new EcoreLibraryOppositeProperty(WebPackage.Literals.INDIVIDUAL__ATTRIBUTES));
		public static final ExecutorProperty _Column__Table__columns = new ExecutorPropertyWithImplementation("Table", Types._Column, 3, new EcoreLibraryOppositeProperty(WebPackage.Literals.TABLE__COLUMNS));

		public static final ExecutorProperty _Content__type = new EcoreExecutorProperty(WebPackage.Literals.CONTENT__TYPE, Types._Content, 0);
		public static final ExecutorProperty _Content__Individual__contents = new ExecutorPropertyWithImplementation("Individual", Types._Content, 1, new EcoreLibraryOppositeProperty(WebPackage.Literals.INDIVIDUAL__CONTENTS));

		public static final ExecutorProperty _Index__individuals = new EcoreExecutorProperty(WebPackage.Literals.INDEX__INDIVIDUALS, Types._Index, 0);
		public static final ExecutorProperty _Index__links = new EcoreExecutorProperty(WebPackage.Literals.INDEX__LINKS, Types._Index, 1);
		public static final ExecutorProperty _Index__table = new EcoreExecutorProperty(WebPackage.Literals.INDEX__TABLE, Types._Index, 2);
		public static final ExecutorProperty _Index__Page__list = new ExecutorPropertyWithImplementation("Page", Types._Index, 3, new EcoreLibraryOppositeProperty(WebPackage.Literals.PAGE__LIST));
		public static final ExecutorProperty _Index__Table__indexPages = new ExecutorPropertyWithImplementation("Table", Types._Index, 4, new EcoreLibraryOppositeProperty(WebPackage.Literals.TABLE__INDEX_PAGES));

		public static final ExecutorProperty _Individual__attributes = new EcoreExecutorProperty(WebPackage.Literals.INDIVIDUAL__ATTRIBUTES, Types._Individual, 0);
		public static final ExecutorProperty _Individual__contents = new EcoreExecutorProperty(WebPackage.Literals.INDIVIDUAL__CONTENTS, Types._Individual, 1);
		public static final ExecutorProperty _Individual__links = new EcoreExecutorProperty(WebPackage.Literals.INDIVIDUAL__LINKS, Types._Individual, 2);
		public static final ExecutorProperty _Individual__table = new EcoreExecutorProperty(WebPackage.Literals.INDIVIDUAL__TABLE, Types._Individual, 3);
		public static final ExecutorProperty _Individual__Index__individuals = new ExecutorPropertyWithImplementation("Index", Types._Individual, 4, new EcoreLibraryOppositeProperty(WebPackage.Literals.INDEX__INDIVIDUALS));
		public static final ExecutorProperty _Individual__Link__individual = new ExecutorPropertyWithImplementation("Link", Types._Individual, 5, new EcoreLibraryOppositeProperty(WebPackage.Literals.LINK__INDIVIDUAL));
		public static final ExecutorProperty _Individual__Page__individual = new ExecutorPropertyWithImplementation("Page", Types._Individual, 6, new EcoreLibraryOppositeProperty(WebPackage.Literals.PAGE__INDIVIDUAL));
		public static final ExecutorProperty _Individual__Table__individualPages = new ExecutorPropertyWithImplementation("Table", Types._Individual, 7, new EcoreLibraryOppositeProperty(WebPackage.Literals.TABLE__INDIVIDUAL_PAGES));

		public static final ExecutorProperty _Link__individual = new EcoreExecutorProperty(WebPackage.Literals.LINK__INDIVIDUAL, Types._Link, 0);
		public static final ExecutorProperty _Link__name = new EcoreExecutorProperty(WebPackage.Literals.LINK__NAME, Types._Link, 1);
		public static final ExecutorProperty _Link__Index__links = new ExecutorPropertyWithImplementation("Index", Types._Link, 2, new EcoreLibraryOppositeProperty(WebPackage.Literals.INDEX__LINKS));
		public static final ExecutorProperty _Link__Individual__links = new ExecutorPropertyWithImplementation("Individual", Types._Link, 3, new EcoreLibraryOppositeProperty(WebPackage.Literals.INDIVIDUAL__LINKS));

		public static final ExecutorProperty _NamedElement__name = new EcoreExecutorProperty(WebPackage.Literals.NAMED_ELEMENT__NAME, Types._NamedElement, 0);

		public static final ExecutorProperty _Page__individual = new EcoreExecutorProperty(WebPackage.Literals.PAGE__INDIVIDUAL, Types._Page, 0);
		public static final ExecutorProperty _Page__list = new EcoreExecutorProperty(WebPackage.Literals.PAGE__LIST, Types._Page, 1);
		public static final ExecutorProperty _Page__WebApp__pages = new ExecutorPropertyWithImplementation("WebApp", Types._Page, 2, new EcoreLibraryOppositeProperty(WebPackage.Literals.WEB_APP__PAGES));

		public static final ExecutorProperty _Table__columns = new EcoreExecutorProperty(WebPackage.Literals.TABLE__COLUMNS, Types._Table, 0);
		public static final ExecutorProperty _Table__indexPages = new EcoreExecutorProperty(WebPackage.Literals.TABLE__INDEX_PAGES, Types._Table, 1);
		public static final ExecutorProperty _Table__individualPages = new EcoreExecutorProperty(WebPackage.Literals.TABLE__INDIVIDUAL_PAGES, Types._Table, 2);
		public static final ExecutorProperty _Table__Index__table = new ExecutorPropertyWithImplementation("Index", Types._Table, 3, new EcoreLibraryOppositeProperty(WebPackage.Literals.INDEX__TABLE));
		public static final ExecutorProperty _Table__Individual__table = new ExecutorPropertyWithImplementation("Individual", Types._Table, 4, new EcoreLibraryOppositeProperty(WebPackage.Literals.INDIVIDUAL__TABLE));
		public static final ExecutorProperty _Table__WebApp__tables = new ExecutorPropertyWithImplementation("WebApp", Types._Table, 5, new EcoreLibraryOppositeProperty(WebPackage.Literals.WEB_APP__TABLES));

		public static final ExecutorProperty _WebApp__pages = new EcoreExecutorProperty(WebPackage.Literals.WEB_APP__PAGES, Types._WebApp, 0);
		public static final ExecutorProperty _WebApp__tables = new EcoreExecutorProperty(WebPackage.Literals.WEB_APP__TABLES, Types._WebApp, 1);
		public static final ExecutorProperty _WebApp__version = new EcoreExecutorProperty(WebPackage.Literals.WEB_APP__VERSION, Types._WebApp, 2);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of WebTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Column =
			{
				Fragments._Column__OclAny /* 0 */,
				Fragments._Column__OclElement /* 1 */,
				Fragments._Column__NamedElement /* 2 */,
				Fragments._Column__Column /* 3 */
			};
		private static final int /*@NonNull*/ [] __Column = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ColumnType =
			{
				Fragments._ColumnType__OclAny /* 0 */,
				Fragments._ColumnType__OclElement /* 1 */,
				Fragments._ColumnType__OclType /* 2 */,
				Fragments._ColumnType__OclEnumeration /* 3 */,
				Fragments._ColumnType__ColumnType /* 4 */
			};
		private static final int /*@NonNull*/ [] __ColumnType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Content =
			{
				Fragments._Content__OclAny /* 0 */,
				Fragments._Content__OclElement /* 1 */,
				Fragments._Content__NamedElement /* 2 */,
				Fragments._Content__Content /* 3 */
			};
		private static final int /*@NonNull*/ [] __Content = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _ContentType =
			{
				Fragments._ContentType__OclAny /* 0 */,
				Fragments._ContentType__OclElement /* 1 */,
				Fragments._ContentType__OclType /* 2 */,
				Fragments._ContentType__OclEnumeration /* 3 */,
				Fragments._ContentType__ContentType /* 4 */
			};
		private static final int /*@NonNull*/ [] __ContentType = { 1,1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Index =
			{
				Fragments._Index__OclAny /* 0 */,
				Fragments._Index__OclElement /* 1 */,
				Fragments._Index__NamedElement /* 2 */,
				Fragments._Index__Index /* 3 */
			};
		private static final int /*@NonNull*/ [] __Index = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Individual =
			{
				Fragments._Individual__OclAny /* 0 */,
				Fragments._Individual__OclElement /* 1 */,
				Fragments._Individual__NamedElement /* 2 */,
				Fragments._Individual__Individual /* 3 */
			};
		private static final int /*@NonNull*/ [] __Individual = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Link =
			{
				Fragments._Link__OclAny /* 0 */,
				Fragments._Link__OclElement /* 1 */,
				Fragments._Link__Link /* 2 */
			};
		private static final int /*@NonNull*/ [] __Link = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _NamedElement =
			{
				Fragments._NamedElement__OclAny /* 0 */,
				Fragments._NamedElement__OclElement /* 1 */,
				Fragments._NamedElement__NamedElement /* 2 */
			};
		private static final int /*@NonNull*/ [] __NamedElement = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Page =
			{
				Fragments._Page__OclAny /* 0 */,
				Fragments._Page__OclElement /* 1 */,
				Fragments._Page__NamedElement /* 2 */,
				Fragments._Page__Page /* 3 */
			};
		private static final int /*@NonNull*/ [] __Page = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Table =
			{
				Fragments._Table__OclAny /* 0 */,
				Fragments._Table__OclElement /* 1 */,
				Fragments._Table__NamedElement /* 2 */,
				Fragments._Table__Table /* 3 */
			};
		private static final int /*@NonNull*/ [] __Table = { 1,1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _WebApp =
			{
				Fragments._WebApp__OclAny /* 0 */,
				Fragments._WebApp__OclElement /* 1 */,
				Fragments._WebApp__NamedElement /* 2 */,
				Fragments._WebApp__WebApp /* 3 */
			};
		private static final int /*@NonNull*/ [] __WebApp = { 1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Column.initFragments(_Column, __Column);
			Types._ColumnType.initFragments(_ColumnType, __ColumnType);
			Types._Content.initFragments(_Content, __Content);
			Types._ContentType.initFragments(_ContentType, __ContentType);
			Types._Index.initFragments(_Index, __Index);
			Types._Individual.initFragments(_Individual, __Individual);
			Types._Link.initFragments(_Link, __Link);
			Types._NamedElement.initFragments(_NamedElement, __NamedElement);
			Types._Page.initFragments(_Page, __Page);
			Types._Table.initFragments(_Table, __Table);
			Types._WebApp.initFragments(_WebApp, __WebApp);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of WebTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Column__Column = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Column__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Column__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Column__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ColumnType__ColumnType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ColumnType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ColumnType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ColumnType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ColumnType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Content__Content = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Content__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Content__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Content__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _ContentType__ContentType = {};
		private static final ExecutorOperation /*@NonNull*/ [] _ContentType__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ContentType__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ContentType__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances(Integer[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _ContentType__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Index__Index = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Index__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Index__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Index__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Individual__Individual = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Individual__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Individual__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Individual__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Link__Link = {
			WebTables.Operations._Link__referencesNumber /* referencesNumber() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Link__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Link__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _NamedElement__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Page__Page = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Page__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Page__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Page__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Table__Table = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Table__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Table__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Table__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _WebApp__WebApp = {
			WebTables.Operations._WebApp__entityInstancesNumber /* entityInstancesNumber(String[1]) */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _WebApp__NamedElement = {};
		private static final ExecutorOperation /*@NonNull*/ [] _WebApp__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _WebApp__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Column__Column.initOperations(_Column__Column);
			Fragments._Column__NamedElement.initOperations(_Column__NamedElement);
			Fragments._Column__OclAny.initOperations(_Column__OclAny);
			Fragments._Column__OclElement.initOperations(_Column__OclElement);

			Fragments._ColumnType__ColumnType.initOperations(_ColumnType__ColumnType);
			Fragments._ColumnType__OclAny.initOperations(_ColumnType__OclAny);
			Fragments._ColumnType__OclElement.initOperations(_ColumnType__OclElement);
			Fragments._ColumnType__OclEnumeration.initOperations(_ColumnType__OclEnumeration);
			Fragments._ColumnType__OclType.initOperations(_ColumnType__OclType);

			Fragments._Content__Content.initOperations(_Content__Content);
			Fragments._Content__NamedElement.initOperations(_Content__NamedElement);
			Fragments._Content__OclAny.initOperations(_Content__OclAny);
			Fragments._Content__OclElement.initOperations(_Content__OclElement);

			Fragments._ContentType__ContentType.initOperations(_ContentType__ContentType);
			Fragments._ContentType__OclAny.initOperations(_ContentType__OclAny);
			Fragments._ContentType__OclElement.initOperations(_ContentType__OclElement);
			Fragments._ContentType__OclEnumeration.initOperations(_ContentType__OclEnumeration);
			Fragments._ContentType__OclType.initOperations(_ContentType__OclType);

			Fragments._Index__Index.initOperations(_Index__Index);
			Fragments._Index__NamedElement.initOperations(_Index__NamedElement);
			Fragments._Index__OclAny.initOperations(_Index__OclAny);
			Fragments._Index__OclElement.initOperations(_Index__OclElement);

			Fragments._Individual__Individual.initOperations(_Individual__Individual);
			Fragments._Individual__NamedElement.initOperations(_Individual__NamedElement);
			Fragments._Individual__OclAny.initOperations(_Individual__OclAny);
			Fragments._Individual__OclElement.initOperations(_Individual__OclElement);

			Fragments._Link__Link.initOperations(_Link__Link);
			Fragments._Link__OclAny.initOperations(_Link__OclAny);
			Fragments._Link__OclElement.initOperations(_Link__OclElement);

			Fragments._NamedElement__NamedElement.initOperations(_NamedElement__NamedElement);
			Fragments._NamedElement__OclAny.initOperations(_NamedElement__OclAny);
			Fragments._NamedElement__OclElement.initOperations(_NamedElement__OclElement);

			Fragments._Page__NamedElement.initOperations(_Page__NamedElement);
			Fragments._Page__OclAny.initOperations(_Page__OclAny);
			Fragments._Page__OclElement.initOperations(_Page__OclElement);
			Fragments._Page__Page.initOperations(_Page__Page);

			Fragments._Table__NamedElement.initOperations(_Table__NamedElement);
			Fragments._Table__OclAny.initOperations(_Table__OclAny);
			Fragments._Table__OclElement.initOperations(_Table__OclElement);
			Fragments._Table__Table.initOperations(_Table__Table);

			Fragments._WebApp__NamedElement.initOperations(_WebApp__NamedElement);
			Fragments._WebApp__OclAny.initOperations(_WebApp__OclAny);
			Fragments._WebApp__OclElement.initOperations(_WebApp__OclElement);
			Fragments._WebApp__WebApp.initOperations(_WebApp__WebApp);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of WebTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Column = {
			WebTables.Properties._Column__isPK,
			WebTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			WebTables.Properties._Column__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ColumnType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Content = {
			WebTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			WebTables.Properties._Content__type
		};

		private static final ExecutorProperty /*@NonNull*/ [] _ContentType = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Index = {
			WebTables.Properties._Index__individuals,
			WebTables.Properties._Index__links,
			WebTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			WebTables.Properties._Index__table
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Individual = {
			WebTables.Properties._Individual__attributes,
			WebTables.Properties._Individual__contents,
			WebTables.Properties._Individual__links,
			WebTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			WebTables.Properties._Individual__table
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Link = {
			WebTables.Properties._Link__individual,
			WebTables.Properties._Link__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _NamedElement = {
			WebTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Page = {
			WebTables.Properties._Page__individual,
			WebTables.Properties._Page__list,
			WebTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Table = {
			WebTables.Properties._Table__columns,
			WebTables.Properties._Table__indexPages,
			WebTables.Properties._Table__individualPages,
			WebTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _WebApp = {
			WebTables.Properties._NamedElement__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			WebTables.Properties._WebApp__pages,
			WebTables.Properties._WebApp__tables,
			WebTables.Properties._WebApp__version
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Column__Column.initProperties(_Column);
			Fragments._ColumnType__ColumnType.initProperties(_ColumnType);
			Fragments._Content__Content.initProperties(_Content);
			Fragments._ContentType__ContentType.initProperties(_ContentType);
			Fragments._Index__Index.initProperties(_Index);
			Fragments._Individual__Individual.initProperties(_Individual);
			Fragments._Link__Link.initProperties(_Link);
			Fragments._NamedElement__NamedElement.initProperties(_NamedElement);
			Fragments._Page__Page.initProperties(_Page);
			Fragments._Table__Table.initProperties(_Table);
			Fragments._WebApp__WebApp.initProperties(_WebApp);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of WebTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		public static final EcoreExecutorEnumerationLiteral _ColumnType__string = new EcoreExecutorEnumerationLiteral(WebPackage.Literals.COLUMN_TYPE.getEEnumLiteral("string"), Types._ColumnType, 0);
		public static final EcoreExecutorEnumerationLiteral _ColumnType__int = new EcoreExecutorEnumerationLiteral(WebPackage.Literals.COLUMN_TYPE.getEEnumLiteral("int"), Types._ColumnType, 1);
		public static final EcoreExecutorEnumerationLiteral _ColumnType__date = new EcoreExecutorEnumerationLiteral(WebPackage.Literals.COLUMN_TYPE.getEEnumLiteral("date"), Types._ColumnType, 2);
		public static final EcoreExecutorEnumerationLiteral _ColumnType__text = new EcoreExecutorEnumerationLiteral(WebPackage.Literals.COLUMN_TYPE.getEEnumLiteral("text"), Types._ColumnType, 3);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _ColumnType = {
			_ColumnType__string,
			_ColumnType__int,
			_ColumnType__date,
			_ColumnType__text
		};

		public static final EcoreExecutorEnumerationLiteral _ContentType__audio = new EcoreExecutorEnumerationLiteral(WebPackage.Literals.CONTENT_TYPE.getEEnumLiteral("audio"), Types._ContentType, 0);
		public static final EcoreExecutorEnumerationLiteral _ContentType__video = new EcoreExecutorEnumerationLiteral(WebPackage.Literals.CONTENT_TYPE.getEEnumLiteral("video"), Types._ContentType, 1);
		public static final EcoreExecutorEnumerationLiteral _ContentType__textarea = new EcoreExecutorEnumerationLiteral(WebPackage.Literals.CONTENT_TYPE.getEEnumLiteral("textarea"), Types._ContentType, 2);
		private static final EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _ContentType = {
			_ContentType__audio,
			_ContentType__video,
			_ContentType__textarea
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._ColumnType.initLiterals(_ColumnType);
			Types._ContentType.initLiterals(_ContentType);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of WebTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new WebTables();
	}

	private WebTables() {
		super(WebPackage.eNS_URI);
	}

	/*
	 * The EClasses whose instances should be cached to support allInstances().
	 */
	private static final EClass allInstancesEClasses /*@NonNull*/ [] = {
		WebPackage.Literals.COLUMN,
		WebPackage.Literals.INDEX,
		WebPackage.Literals.INDIVIDUAL,
		WebPackage.Literals.LINK,
		WebPackage.Literals.PAGE
	};

	@Override
	public EClass /*@NonNull*/ [] basicGetAllInstancesClasses() {
		return allInstancesEClasses;
	}
}
