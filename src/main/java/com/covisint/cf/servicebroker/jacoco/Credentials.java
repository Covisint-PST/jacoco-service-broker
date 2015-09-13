package com.covisint.cf.servicebroker.jacoco;

/**
 * 
 * A holder for credential information such as the jacoco agent 
 * name for the agent
 * 
 * @version 1.0, 2015-10-09
 * @author Lingeshm
 *
 */
public final class Credentials {

	private final String destfile = "jacoco.exec";
	private final boolean append = true;
	private final String includes = "*";
	private final String excludes="";
	private final String exclclassloader="sun.reflect.DelegatingClassLoader";
	private final boolean inclbootstrapclasses = false ;
	private final String sessionid = "";
	private final boolean dumponexit = true;
	private final String output = "tcpclient";
	private final String address="";
	private final String port="6300";
	private final String classdumpdir="";
	private final boolean jmx = false;
    private final String configuration;
    

    
	/**
     * Creates a new instance with a given configuration 
     *
     *only !!! configuration parameter only consider for initial version , 
     *in future if required all jacoco agent configuration will be implemented.
     *
     * @param configuration the configuration to appender for agent arguments
     * 
     */
    public Credentials(String configuration) {
        this.configuration = configuration;

    }

    /**
     * Returns the configuration 
     *
     * @return the configuration with tcpserver , destfilepath , etc
     */
    public String getConfiguration() {
		return configuration;
	}

	/**
	 * Path to the output file for execution data 
	 * @return the destfile
	 */
	public String getDestfile() {
		return destfile;
	}

	/**
	 * If set to true and the execution data file already exists, 
	 * coverage data is appended to the existing file. If set to false,
	 * an existing execution data file will be replaced 
	 * 
	 * @return the append
	 */
	public boolean isAppend() {
		return append;
	}

	/**
	 * A list of class names that should be included in execution analysis. 
	 * The list entries are separated by a colon (:) and may use wildcard characters (* and ?). 
	 * Except for performance optimization or technical corner cases this option is normally not required.
	 * 
	 * @return the includes
	 */
	public String getIncludes() {
		return includes;
	}

	/**
	 * A list of class names that should be excluded from execution analysis. 
	 * The list entries are separated by a colon (:) and may use wildcard characters (* and ?).
	 * Except for performance optimization or technical corner cases this option is normally not required. 
	 * 
	 * @return the excludes
	 */
	public String getExcludes() {
		return excludes;
	}

	/**
	 * A list of class loader names that should be excluded from execution analysis. 
	 * The list entries are separated by a colon (:) and may use wildcard characters (* and ?). 
	 * This option might be required in case of special frameworks that conflict with JaCoCo code instrumentation,
	 * in particular class loaders that do not have access to the Java runtime classes. 
	 * 
	 * @return the exclclassloader
	 */
	public String getExclclassloader() {
		return exclclassloader;
	}

	/**
	 * Specifies whether also classes from the bootstrap classloader should be instrumented. 
	 * Use this feature with caution, it needs heavy includes/excludes tuning.
	 * 
	 * @return the inclbootstrapclasses
	 */
	public boolean isInclbootstrapclasses() {
		return inclbootstrapclasses;
	}

	/**
	 * A session identifier that is written with the execution data.
	 * Without this parameter a random identifier is created by the agent.
	 * 
	 * @return the sessionid
	 */
	public String getSessionid() {
		return sessionid;
	}

	/**
	 * if set to true coverage data will be written on VM shutdown. 
	 * The dump can only be written if either file is specified or 
	 * the output is tcpserver/tcpclient and a connection is open at the time when the VM terminates.
	 * 
	 * 
	 * @return the dumponexit
	 */
	public boolean isDumponexit() {
		return dumponexit;
	}

	/**
	 * file: At VM termination execution data is written to the file specified in the destfile attribute.
	 * tcpserver: The agent listens for incoming connections on the TCP port specified by the address and 
	 * port attribute. Execution data is written to this TCP connection.
	 * tcpclient: At startup the agent connects to the TCP port specified by the address and port attribute. 
	 * Execution data is written to this TCP connection.
	 * none: Do not produce any output
	 * 
	 * 
	 * @return the output
	 */
	public String getOutput() {
		return output;
	}

	/**
	 * IP address or hostname to bind to when the output method is tcpserver or
	 * connect to when the output method is tcpclient. 
	 * In tcpserver mode the value "*" causes the agent to accept connections on any local address.
	 * 
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Port to bind to when the output method is tcpserver or connect to when the output method is tcpclient.
	 * In tcpserver mode the port must be available, 
	 * which means that if multiple JaCoCo agents should run on the same machine, 
	 * different ports have to be specified
	 * 
	 * @return the port
	 */
	public String getPort() {
		return port;
	}

	/**
	 * @return the classdumpdir
	 */
	public String getClassdumpdir() {
		return classdumpdir;
	}

	/**
	 * @return the jmx
	 */
	public boolean isJmx() {
		return jmx;
	}

}
