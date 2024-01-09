package com.kn.polymorphism3;

public class SoftwareDemo {

	public static void main(String[] args) {

		BackendEngineer be = new BackendEngineer();
		DatabaseEngineer de = new DatabaseEngineer();
		JavaBackendEngineer je = new JavaBackendEngineer();
		PythonBackendEngineer pe = new PythonBackendEngineer();
		doActivity(be);
		doActivity(de);
		doActivity(je);
		doActivity(pe);

	}

	public static void doActivity(SoftwareEngineer se) {
		se.attendMeeting();
		se.writeTestCase();

		if (se instanceof JavaBackendEngineer) {
			System.out.println("--->Java Backend Engineer");
			((JavaBackendEngineer) (se)).doBackendProject();
			((JavaBackendEngineer) (se)).learnJava();
		} else if (se instanceof PythonBackendEngineer) {
			System.out.println("--->Python Backend Engineer");
			((PythonBackendEngineer) (se)).doBackendProject();
			((PythonBackendEngineer) (se)).learnPython();
		} else if (se instanceof DatabaseEngineer) {
			System.out.println("--->Database Engineer");
			((DatabaseEngineer) (se)).attendMeeting();
			((DatabaseEngineer) (se)).doDatabaseProject();
			((DatabaseEngineer) (se)).learnSQL();
		} else if (se instanceof BackendEngineer) {
			System.out.println("--->Backend Engineer");
			((BackendEngineer) (se)).attendMeeting();
			((BackendEngineer) (se)).doBackendProject();

		}

	}

}
